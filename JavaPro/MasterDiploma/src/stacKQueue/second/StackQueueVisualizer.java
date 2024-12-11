package stacKQueue.second;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.*;

public class StackQueueVisualizer extends Application {

    private VBox animationArea; // Область для анімації
    private TextArea logArea;   // Лог для запису звіту
    private Queue<Label> visualQueue = new LinkedList<>();
    private Stack<Label> visualStack = new Stack<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Головний інтерфейс
        BorderPane root = new BorderPane();
        animationArea = new VBox(5);
        animationArea.setStyle("-fx-padding: 10; -fx-border-color: black; -fx-border-width: 2;");
        animationArea.setPrefHeight(300);

        logArea = new TextArea();
        logArea.setEditable(false);

        VBox controls = new VBox(10);
        controls.setStyle("-fx-padding: 10;");
        ComboBox<String> structureChoice = new ComboBox<>();
        structureChoice.getItems().addAll("Stack (Стек)", "Queue (Черга)");
        structureChoice.setValue("Stack (Стек)");

        TextField sizeInput = new TextField();
        sizeInput.setPromptText("Розмір структури");

        Button startButton = new Button("Запустити");
        controls.getChildren().addAll(
                new Label("Оберіть структуру:"),
                structureChoice,
                new Label("Розмір структури:"),
                sizeInput,
                startButton
        );

        root.setLeft(controls);
        root.setCenter(animationArea);
        root.setBottom(logArea);

        // Подія для запуску
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

            runExperiment(structure, size);
        });

        // Налаштування сцени
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Stack & Queue Visualizer");
        primaryStage.show();
    }

    private void runExperiment(String structure, int size) {
        logArea.clear();
        animationArea.getChildren().clear();
        visualQueue.clear();
        visualStack.clear();
        logArea.appendText("Початок дослідження для " + structure + " з розміром " + size + "...\n");

        Random random = new Random();
        if (structure.equals("Stack (Стек)")) {
            Stack<Integer> stack = new Stack<>();
            Timeline timeline = new Timeline();
            for (int i = 0; i < size; i++) {
                int value = random.nextInt(100);
                stack.push(value);

                // Візуалізація додавання
                int index = i;
                timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(index * 0.5), e -> {
                    Label block = new Label(String.valueOf(value));
                    block.setStyle("-fx-border-color: black; -fx-padding: 5; -fx-background-color: lightblue;");
                    visualStack.push(block);
                    animationArea.getChildren().add(0, block);
                    logArea.appendText("Додавання до стека: " + value + "\n");
                }));
            }
            for (int i = 0; i < size; i++) {
                int index = i;
                timeline.getKeyFrames().add(new KeyFrame(Duration.seconds((size + index) * 0.5), e -> {
                    Label removed = visualStack.pop();
                    animationArea.getChildren().remove(removed);
                    logArea.appendText("Видалення зі стека: " + removed.getText() + "\n");
                }));
            }
            timeline.play();

        } else if (structure.equals("Queue (Черга)")) {
            Queue<Integer> queue = new LinkedList<>();
            Timeline timeline = new Timeline();
            for (int i = 0; i < size; i++) {
                int value = random.nextInt(100);
                queue.add(value);

                // Візуалізація додавання
                int index = i;
                timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(index * 0.5), e -> {
                    Label block = new Label(String.valueOf(value));
                    block.setStyle("-fx-border-color: black; -fx-padding: 5; -fx-background-color: lightgreen;");
                    visualQueue.add(block);
                    animationArea.getChildren().add(block);
                    logArea.appendText("Додавання до черги: " + value + "\n");
                }));
            }
            for (int i = 0; i < size; i++) {
                int index = i;
                timeline.getKeyFrames().add(new KeyFrame(Duration.seconds((size + index) * 0.5), e -> {
                    Label removed = visualQueue.poll();
                    animationArea.getChildren().remove(removed);
                    logArea.appendText("Видалення з черги: " + removed.getText() + "\n");
                }));
            }
            timeline.play();
        }
    }
}
