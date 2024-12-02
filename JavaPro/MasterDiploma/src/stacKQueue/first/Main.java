package stacKQueue.first;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    private StackPane stackPane;
    private VBox mainPane;
    private ComboBox<String> experimentTypeDropdown;

    @Override
    public void start(Stage stage) {
        stackPane = new StackPane();
        mainPane = new VBox();

        createExperimentTypeDropdown();
        createChart();

        Scene scene = new Scene(mainPane, 800, 600);
        stage.setTitle("Stack and Queue Visualizer");
        stage.setScene(scene);
        stage.show();
    }

    // Створення випадаючого меню для вибору типу експерименту
    private void createExperimentTypeDropdown() {
        experimentTypeDropdown = new ComboBox<>();
        experimentTypeDropdown.getItems().addAll("Stack Operations", "Queue Operations", "Search Experiment", "Merge Experiment");
        experimentTypeDropdown.setValue("Stack Operations"); // Вибір за замовчуванням
        experimentTypeDropdown.setOnAction(e -> updateExperimentType());

        mainPane.getChildren().add(experimentTypeDropdown);
    }

    // Оновлення типу експерименту
    private void updateExperimentType() {
        String selectedType = experimentTypeDropdown.getValue();
        switch (selectedType) {
            case "Stack Operations" -> setupStackExperiment();
            case "Queue Operations" -> setupQueueExperiment();
            case "Search Experiment" -> setupSearchExperiment();
            case "Merge Experiment" -> setupMergeExperiment();
            default -> System.out.println("Unknown experiment type.");
        }
    }

    // Налаштування експерименту для стека
    private void setupStackExperiment() {
        // Тут реалізувати експеримент для стека
        animateStackPush("A");
        animateStackPush("B");
        animateStackPush("C");
    }

    // Налаштування експерименту для черги
    private void setupQueueExperiment() {
        // Тут реалізувати експеримент для черги
    }

    // Створення та показ графіка
    private void createChart() {
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Operations");
        yAxis.setLabel("Execution Time (ms)");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Experiment Results");

        // Додати серію даних
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Stack Operations");
        series.getData().add(new XYChart.Data<>(1, 10));
        series.getData().add(new XYChart.Data<>(2, 15));
        series.getData().add(new XYChart.Data<>(3, 20));

        lineChart.getData().add(series);

        mainPane.getChildren().add(lineChart); // Додати графік на екран
    }

    // Анімація додавання елементу в стек
    private void animateStackPush(String value) {
        Rectangle rect = new Rectangle(50, 30);
        rect.setFill(Color.LIGHTBLUE);
        rect.setStroke(Color.BLACK);
        stackPane.getChildren().add(rect);

        // Анімація додавання
        Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(
                Duration.millis(500),
                event -> {
                    rect.setY(rect.getY() - 50); // Зміна позиції блоку
                }
        );
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();
    }

    // **Пошук (Search Experiment)**

    // Реалізація пошуку та анімація
    private void setupSearchExperiment() {
        List<Integer> data = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            data.add(i);
        }

        String target = "5"; // Можна змінювати для різних результатів пошуку

        // Анімація пошуку елемента
        for (int i = 0; i < data.size(); i++) {
            animateSearchStep(data.get(i), target);
        }
    }

    // Анімація пошуку
    private void animateSearchStep(int value, String target) {
        Rectangle rect = new Rectangle(50, 30);
        rect.setFill(Color.LIGHTGREEN);
        rect.setStroke(Color.BLACK);
        stackPane.getChildren().add(rect);

        // Пошук
        Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(
                Duration.millis(500),
                event -> {
                    if (String.valueOf(value).equals(target)) {
                        rect.setFill(Color.RED); // Підсвічування знайденого елементу
                    }
                    rect.setY(rect.getY() - 50); // Анімація
                }
        );
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();
    }

    // **Злиття (Merge Experiment)**

    // Реалізація злиття двох масивів та анімація
    private void setupMergeExperiment() {
        List<Integer> array1 = List.of(1, 4, 7);
        List<Integer> array2 = List.of(2, 5, 8);

        // Злиття масивів
        mergeArrays(array1, array2);
    }

    // Анімація злиття масивів
    private void mergeArrays(List<Integer> array1, List<Integer> array2) {
        int i = 0, j = 0;
        List<Integer> mergedArray = new ArrayList<>();

        // Анімація злиття
        while (i < array1.size() && j < array2.size()) {
            if (array1.get(i) < array2.get(j)) {
                mergedArray.add(array1.get(i));
                animateMergeStep(array1.get(i));
                i++;
            } else {
                mergedArray.add(array2.get(j));
                animateMergeStep(array2.get(j));
                j++;
            }
        }

        // Додавання решти елементів
        while (i < array1.size()) {
            mergedArray.add(array1.get(i));
            animateMergeStep(array1.get(i));
            i++;
        }

        while (j < array2.size()) {
            mergedArray.add(array2.get(j));
            animateMergeStep(array2.get(j));
            j++;
        }

        System.out.println("Merged Array: " + mergedArray);
    }

    // Анімація злиття
    private void animateMergeStep(int value) {
        Rectangle rect = new Rectangle(50, 30);
        rect.setFill(Color.LIGHTCORAL);
        rect.setStroke(Color.BLACK);
        stackPane.getChildren().add(rect);

        // Анімація
        Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(
                Duration.millis(500),
                event -> rect.setY(rect.getY() - 50)
        );
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();
    }

    public static void main(String[] args) {
        launch();
    }
}
