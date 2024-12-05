package stacKQueue.second;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class AdvancedStackQueueVisualizer extends Application {

    private TextArea logArea;
    private LineChart<Number, Number> chart;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        VBox controls = new VBox(10);
        controls.setStyle("-fx-padding: 10;");
        ComboBox<String> structureChoice = new ComboBox<>();
        structureChoice.getItems().addAll("Stack", "Queue", "Priority Queue");
        structureChoice.setValue("Stack");

        TextField sizeInput = new TextField();
        sizeInput.setPromptText("Розмір структури");

        Button startButton = new Button("Запустити дослідження");
        CheckBox multithreadingCheck = new CheckBox("Багатопотоковий режим");
        controls.getChildren().addAll(new Label("Оберіть структуру:"), structureChoice,
                new Label("Розмір структури:"), sizeInput,
                multithreadingCheck, startButton);

        root.setLeft(controls);

        logArea = new TextArea();
        logArea.setEditable(false);
        logArea.setStyle("-fx-font-family: monospace;");
        root.setBottom(logArea);

        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Операція");
        yAxis.setLabel("Час виконання (мс)");
        chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Результати досліджень");
        root.setCenter(chart);

        startButton.setOnAction(e -> {
            String structure = structureChoice.getValue();
            int size;
            boolean multithreaded = multithreadingCheck.isSelected();
            try {
                size = Integer.parseInt(sizeInput.getText());
                if (size <= 0) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                logArea.appendText("Невірний розмір структури!\n");
                return;
            }
            runExperiment(structure, size, multithreaded);
        });

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Advanced Stack & Queue Visualizer");
        primaryStage.show();
    }

    private void runExperiment(String structure, int size, boolean multithreaded) {
        logArea.appendText("Запуск експерименту для " + structure + " (розмір: " + size + ")...\n");
        List<Long> times = new ArrayList<>();
        Random random = new Random();

        if (multithreaded) {
            runMultithreadedExperiment(structure, size, times);
        } else {
            if ("Stack".equals(structure)) {
                Stack<Integer> stack = new Stack<>();
                measureOperationTime(() -> {
                    for (int i = 0; i < size; i++) stack.push(random.nextInt());
                }, "Заповнення стеку", times);

                measureOperationTime(() -> {
                    while (!stack.isEmpty()) stack.pop();
                }, "Очистка стеку", times);
            } else if ("Queue".equals(structure)) {
                Queue<Integer> queue = new LinkedList<>();
                measureOperationTime(() -> {
                    for (int i = 0; i < size; i++) queue.add(random.nextInt());
                }, "Заповнення черги", times);

                measureOperationTime(() -> {
                    while (!queue.isEmpty()) queue.poll();
                }, "Очистка черги", times);
            } else if ("Priority Queue".equals(structure)) {
                PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
                measureOperationTime(() -> {
                    for (int i = 0; i < size; i++) priorityQueue.add(random.nextInt());
                }, "Заповнення пріоритетної черги", times);

                measureOperationTime(() -> {
                    while (!priorityQueue.isEmpty()) priorityQueue.poll();
                }, "Очистка пріоритетної черги", times);
            }
        }

        logArea.appendText("Час виконання операцій (мс): " + times + "\n");
        updateChart(structure, size, times);
        saveResultsToFile(structure, size, times);
    }

    private void measureOperationTime(Runnable operation, String description, List<Long> times) {
        long start = System.nanoTime();
        operation.run();
        long end = System.nanoTime();
        long duration = (end - start) / 1_000_000L;
        times.add(duration);
        logArea.appendText(description + ": " + duration + " мс\n");
    }

    private void runMultithreadedExperiment(String structure, int size, List<Long> times) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        AtomicLong totalDuration = new AtomicLong();
        Runnable task = () -> {
            if ("Stack".equals(structure)) {
                Stack<Integer> stack = new Stack<>();
                for (int i = 0; i < size; i++) stack.push(i);
                while (!stack.isEmpty()) stack.pop();
            } else if ("Queue".equals(structure)) {
                Queue<Integer> queue = new LinkedList<>();
                for (int i = 0; i < size; i++) queue.add(i);
                while (!queue.isEmpty()) queue.poll();
            }
        };

        try {
            long start = System.nanoTime();
            List<Future<?>> futures = new ArrayList<>();
            for (int i = 0; i < 4; i++) futures.add(executor.submit(task));
            for (Future<?> future : futures) future.get();
            long end = System.nanoTime();
            totalDuration.set((end - start) / 1_000_000L);
        } catch (InterruptedException | ExecutionException e) {
            logArea.appendText("Помилка багатопотокового тестування!\n");
        } finally {
            executor.shutdown();
        }

        times.add(totalDuration.get());
        logArea.appendText("Багатопотокове тестування: " + totalDuration.get() + " мс\n");
    }

    private void updateChart(String structure, int size, List<Long> times) {
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName(structure + " (розмір: " + size + ")");
        for (int i = 0; i < times.size(); i++) {
            // Для кожної операції вивести розмір структури як X-вісь
            series.getData().add(new XYChart.Data<>(size, times.get(i)));
        }
        chart.getData().add(series);
    }

    private void saveResultsToFile(String structure, int size, List<Long> times) {
        try (FileWriter writer = new FileWriter("results.csv", true)) {
            writer.write(structure + "," + size + "," + times + "\n");
        } catch (IOException e) {
            logArea.appendText("Помилка запису результатів у файл!\n");
        }
    }
}

