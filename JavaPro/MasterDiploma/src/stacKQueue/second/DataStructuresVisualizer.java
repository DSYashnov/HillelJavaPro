package stacKQueue.second;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.*;

public class DataStructuresVisualizer extends Application {

    // Основні структури даних
    private Stack<Integer> stack = new Stack<>();
    private Queue<Integer> queue = new LinkedList<>();
    private Set<Integer> set = new HashSet<>();

    // Головна сцена програми
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Візуалізація структур даних");

        // Стек: Панель і візуалізація
        VBox stackPane = createStackPane();

        // Черга: Панель і візуалізація
        VBox queuePane = createQueuePane();

        // Множина: Панель і візуалізація
        VBox setPane = createSetPane();

        // Головна сцена
        HBox mainLayout = new HBox(20, stackPane, queuePane, setPane);
        mainLayout.setPadding(new Insets(20));

        Scene scene = new Scene(mainLayout, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Панель для стеку
    private VBox createStackPane() {
        Label stackLabel = new Label("Стек");
        TextField stackInput = new TextField();
        Button pushButton = new Button("Push");
        Button popButton = new Button("Pop");
        VBox stackBox = new VBox(5);

        // Додавання елементів до стеку
        pushButton.setOnAction(e -> {
            try {
                int value = Integer.parseInt(stackInput.getText());
                stack.push(value);
                refreshStack(stackBox);
            } catch (NumberFormatException ex) {
                showError("Введіть коректне число для стеку.");
            }
        });

        // Видалення елементів зі стеку
        popButton.setOnAction(e -> {
            if (!stack.isEmpty()) {
                stack.pop();
                refreshStack(stackBox);
            } else {
                showError("Стек порожній.");
            }
        });

        VBox stackPane = new VBox(10, stackLabel, stackInput, pushButton, popButton, stackBox);
        stackPane.setPadding(new Insets(10));
        stackPane.setStyle("-fx-border-color: black; -fx-border-width: 1px;");
        refreshStack(stackBox);
        return stackPane;
    }

    // Оновлення візуалізації стеку
    private void refreshStack(VBox stackBox) {
        stackBox.getChildren().clear();
        for (int i = stack.size() - 1; i >= 0; i--) {
            Rectangle rect = new Rectangle(100, 30, Color.LIGHTBLUE);
            Label label = new Label(String.valueOf(stack.get(i)));
            StackPane stackPane = new StackPane(rect, label);
            stackBox.getChildren().add(stackPane);
        }
    }

    // Панель для черги
    private VBox createQueuePane() {
        Label queueLabel = new Label("Черга");
        TextField queueInput = new TextField();
        Button enqueueButton = new Button("Enqueue");
        Button dequeueButton = new Button("Dequeue");
        HBox queueBox = new HBox(5);

        // Додавання елементів до черги
        enqueueButton.setOnAction(e -> {
            try {
                int value = Integer.parseInt(queueInput.getText());
                queue.add(value);
                refreshQueue(queueBox);
            } catch (NumberFormatException ex) {
                showError("Введіть коректне число для черги.");
            }
        });

        // Видалення елементів з черги
        dequeueButton.setOnAction(e -> {
            if (!queue.isEmpty()) {
                queue.poll();
                refreshQueue(queueBox);
            } else {
                showError("Черга порожня.");
            }
        });

        VBox queuePane = new VBox(10, queueLabel, queueInput, enqueueButton, dequeueButton, queueBox);
        queuePane.setPadding(new Insets(10));
        queuePane.setStyle("-fx-border-color: black; -fx-border-width: 1px;");
        refreshQueue(queueBox);
        return queuePane;
    }

    // Оновлення візуалізації черги
    private void refreshQueue(HBox queueBox) {
        queueBox.getChildren().clear();
        for (Integer value : queue) {
            Rectangle rect = new Rectangle(50, 30, Color.LIGHTGREEN);
            Label label = new Label(String.valueOf(value));
            StackPane stackPane = new StackPane(rect, label);
            queueBox.getChildren().add(stackPane);
        }
    }

    // Панель для множини
    private VBox createSetPane() {
        Label setLabel = new Label("Множина");
        TextField setInput = new TextField();
        Button addButton = new Button("Додати");
        Button clearButton = new Button("Очистити");
        FlowPane setBox = new FlowPane(5, 5);

        // Додавання елементів до множини
        addButton.setOnAction(e -> {
            try {
                int value = Integer.parseInt(setInput.getText());
                set.add(value);
                refreshSet(setBox);
            } catch (NumberFormatException ex) {
                showError("Введіть коректне число для множини.");
            }
        });

        // Очищення множини
        clearButton.setOnAction(e -> {
            set.clear();
            refreshSet(setBox);
        });

        VBox setPane = new VBox(10, setLabel, setInput, addButton, clearButton, setBox);
        setPane.setPadding(new Insets(10));
        setPane.setStyle("-fx-border-color: black; -fx-border-width: 1px;");
        refreshSet(setBox);
        return setPane;
    }

    // Оновлення візуалізації множини
    private void refreshSet(FlowPane setBox) {
        setBox.getChildren().clear();
        for (Integer value : set) {
            Rectangle rect = new Rectangle(50, 30, Color.ORANGE);
            Label label = new Label(String.valueOf(value));
            StackPane stackPane = new StackPane(rect, label);
            setBox.getChildren().add(stackPane);
        }
    }

    // Показ повідомлення про помилку
    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
