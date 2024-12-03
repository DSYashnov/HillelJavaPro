package stacKQueue.second;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.*;

public class StackQueueVisualizer extends Application {

    private TextArea logArea;
    private LineChart<Number, Number> chart;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Створення головного інтерфейсу
        BorderPane root = new BorderPane();

        // Вибір структури (стек або черга)
        VBox controls = new VBox(10);
        controls.setStyle("-fx-padding: 10;");
        ComboBox<String> structureChoice = new ComboBox<>();
        structureChoice.getItems().addAll("Stack (Стек)", "Queue (Черга)");
        structureChoice.setValue("Stack (Стек)");

        TextField sizeInput = new TextField();
        sizeInput.setPromptText("Розмір структури");

        Button startButton = new Button("Запустити дослідження");
        controls.getChildren().addAll(new Label("Оберіть структуру:"), structureChoice, new Label("Розмір структури:"), sizeInput, startButton);

        root.setLeft(controls);

        // Лог результатів
        logArea = new TextArea();
        logArea.setEditable(false);
        logArea.setStyle("-fx-font-family: monospace;");

        root.setBottom(logArea);

        // Графік
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Операції");
        yAxis.setLabel("Час виконання (мс)");
        chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Результати досліджень");
        root.setCenter(chart);

        // Подія для кнопки
        startButton.setOnAction(e -> {
            String structure = structureChoice.getValue();
            int size;
            try {
                size = Integer.parseInt(sizeInput.getText());
                if (size <= 0) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                logArea.appendText("Невірний розмір структури!\n");
                return;
            }

            // Виконати дослідження
            runExperiment(structure, size);
        });

        // Показати вікно
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Stack & Queue Visualizer");
        primaryStage.show();
    }

    private void runExperiment(String structure, int size) {
        logArea.appendText("Початок дослідження для " + structure + " з розміром " + size + "...\n");

        // Ініціалізація даних
        List<Long> pushTimes = new ArrayList<>();
        List<Long> popTimes = new ArrayList<>();
        Random random = new Random();
        long startTime, endTime;

        // Обробка стеку або черги
        if (structure.equals("Stack (Стек)")) {
            Stack<Integer> stack = new Stack<>();

            // Операція додавання (push)
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) stack.push(random.nextInt());
            endTime = System.nanoTime();
            pushTimes.add((endTime - startTime) / 1_000_000L);

            // Операція видалення (pop)
            startTime = System.nanoTime();
            while (!stack.isEmpty()) stack.pop();
            endTime = System.nanoTime();
            popTimes.add((endTime - startTime) / 1_000_000L);

            // Візуалізація стека
            visualizeStack(stack);

        } else if (structure.equals("Queue (Черга)")) {
            Queue<Integer> queue = new LinkedList<>();

            // Операція додавання (add)
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) queue.add(random.nextInt());
            endTime = System.nanoTime();
            pushTimes.add((endTime - startTime) / 1_000_000L);

            // Операція видалення (poll)
            startTime = System.nanoTime();
            while (!queue.isEmpty()) queue.poll();
            endTime = System.nanoTime();
            popTimes.add((endTime - startTime) / 1_000_000L);

            // Візуалізація черги
            visualizeQueue(queue);
        }

        // Виведення результатів
        logArea.appendText("Час виконання операцій додавання (мс): " + pushTimes + "\n");
        logArea.appendText("Час виконання операцій видалення (мс): " + popTimes + "\n");

        // Оновити графік
        updateChart(structure, size, pushTimes, popTimes);
    }

    private void updateChart(String structure, int size, List<Long> pushTimes, List<Long> popTimes) {
        // Створення серії для операцій додавання
        XYChart.Series<Number, Number> pushSeries = new XYChart.Series<>();
        pushSeries.setName(structure + " - Додавання");
        for (int i = 0; i < pushTimes.size(); i++) {
            pushSeries.getData().add(new XYChart.Data<>(i + 1, pushTimes.get(i)));
        }

        // Створення серії для операцій видалення
        XYChart.Series<Number, Number> popSeries = new XYChart.Series<>();
        popSeries.setName(structure + " - Видалення");
        for (int i = 0; i < popTimes.size(); i++) {
            popSeries.getData().add(new XYChart.Data<>(i + 1, popTimes.get(i)));
        }

        // Додавання серій на графік
        chart.getData().add(pushSeries);
        chart.getData().add(popSeries);

        // Змінюємо кольори серій для кращої наочності
        pushSeries.getNode().setStyle("-fx-stroke: blue; -fx-stroke-width: 2;");
        popSeries.getNode().setStyle("-fx-stroke: red; -fx-stroke-width: 2;");
    }

    private void visualizeStack(Stack<Integer> stack) {
        // Візуалізація стека з анімацією
        Timeline timeline = new Timeline();
        for (Integer element : stack) {
            KeyFrame keyFrame = new KeyFrame(Duration.millis(500), e -> {
                logArea.appendText("Додавання елемента в стек: " + element + "\n");
            });
            timeline.getKeyFrames().add(keyFrame);
        }
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void visualizeQueue(Queue<Integer> queue) {
        // Візуалізація черги з анімацією
        Timeline timeline = new Timeline();
        for (Integer element : queue) {
            KeyFrame keyFrame = new KeyFrame(Duration.millis(500), e -> {
                logArea.appendText("Додавання елемента в чергу: " + element + "\n");
            });
            timeline.getKeyFrames().add(keyFrame);
        }
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
