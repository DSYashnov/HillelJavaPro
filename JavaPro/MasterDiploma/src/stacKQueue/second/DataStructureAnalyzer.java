package stacKQueue.second;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;



public class DataStructureAnalyzer extends Application {

    private TextArea logArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Панель управління
        ComboBox<String> structureChoice = new ComboBox<>();
        structureChoice.getItems().addAll("Stack", "Queue", "Set");
        structureChoice.setValue("Stack");

        TextField sizeInput = new TextField();
        sizeInput.setPromptText("Розмір структури (наприклад, 1000)");

        Button runButton = new Button("Запустити дослідження");
        Button saveButton = new Button("Зберегти результати");

        ToolBar toolBar = new ToolBar(structureChoice, sizeInput, runButton, saveButton);
        root.setTop(toolBar);

        // Область логів
        logArea = new TextArea();
        logArea.setEditable(false);
        root.setBottom(logArea);

        // Графік
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Розмір структури");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Час виконання (нс)");

        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Продуктивність операцій");
        root.setCenter(chart);

        // Дії кнопок
        runButton.setOnAction(e -> {
            String structure = structureChoice.getValue();
            String sizeText = sizeInput.getText();
            try {
                int size = Integer.parseInt(sizeText);
                runExperiment(structure, size, chart);
            } catch (NumberFormatException ex) {
                logArea.appendText("Помилка: Введіть коректний розмір структури.\n");
            }
        });

        saveButton.setOnAction(e -> saveResults());

        Scene scene = new Scene(root, 900, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Аналіз структур даних");
        primaryStage.show();
    }

    private void runExperiment(String structure, int size, LineChart<Number, Number> chart) {
        logArea.clear();
        chart.getData().clear();
        logArea.appendText("Запуск дослідження для " + structure + " з розміром " + size + "\n");

        List<XYChart.Series<Number, Number>> seriesList = new ArrayList<>();

        switch (structure) {
            case "Stack" -> {
                Stack<Integer> stack = new Stack<>();
                seriesList.add(measurePerformance("Stack - Add", size, i -> stack.push(i)));
                seriesList.add(measurePerformance("Stack - Peek", size, i -> stack.peek()));
                seriesList.add(measurePerformance("Stack - Remove All", size, i -> stack.pop()));
            }
            case "Queue" -> {
                Queue<Integer> queue = new LinkedList<>();
                seriesList.add(measurePerformance("Queue - Add", size, i -> queue.add(i)));
                seriesList.add(measurePerformance("Queue - Peek", size, i -> queue.peek()));
                seriesList.add(measurePerformance("Queue - Remove All", size, i -> queue.poll()));
            }
            case "Set" -> {
                Set<Integer> set = new HashSet<>();
                seriesList.add(measurePerformance("Set - Add", size, set::add));
                seriesList.add(measurePerformance("Set - Check", size, set::contains));
                seriesList.add(measurePerformance("Set - Remove All", size, i -> {
                    if (!set.isEmpty()) set.clear();
                }));
            }
        }

        // Додати дані на графік
        for (XYChart.Series<Number, Number> series : seriesList) {
            chart.getData().add(series);
        }
    }

    private XYChart.Series<Number, Number> measurePerformance(String label, int size, PerformanceTest test) {
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName(label);

        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            test.perform(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        logArea.appendText(label + ": " + duration + " нс\n");
        series.getData().add(new XYChart.Data<>(size, duration));

        return series;
    }

    private void saveResults() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Зберегти результати");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV файли", "*.csv"));

        Stage stage = new Stage();
        var file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(logArea.getText());
                logArea.appendText("Результати збережено у файл: " + file.getAbsolutePath() + "\n");
            } catch (IOException e) {
                logArea.appendText("Помилка збереження файлу: " + e.getMessage() + "\n");
            }
        }
    }

    @FunctionalInterface
    private interface PerformanceTest {
        void perform(int input);
    }
}


