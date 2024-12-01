import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BinarySearchVisualization extends Application {

    // Масив, в якому будемо шукати
    int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    // Цільовий елемент для пошуку
    int target = 7;
    // Початкові значення індексів для бінарного пошуку
    int low = 0, high = arr.length - 1;
    int mid = (low + high) / 2;
    // Масив прямокутників для візуалізації елементів масиву
    Rectangle[] bars;
    // Масив підписів для індексів
    Text[] indexLabels;

    // Статус пошуку (чи завершено пошук)
    boolean searchComplete = false;

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: white;");

        // Візуалізація масиву як прямокутників
        bars = new Rectangle[arr.length];
        indexLabels = new Text[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // Створюємо прямокутник для кожного елемента масиву
            bars[i] = new Rectangle(40, arr[i] * 10);  // висота пропорційна значенню
            bars[i].setFill(Color.LIGHTBLUE);  // Встановлюємо початковий колір для всіх елементів
            bars[i].setTranslateX(i * 50 - (arr.length * 50 / 2));  // Розміщуємо прямокутники по осі X

            // Підпис для індексу
            indexLabels[i] = new Text(Integer.toString(i));
            indexLabels[i].setTranslateY(20);  // Позиціюємо підписи зверху
            indexLabels[i].setTranslateX(i * 50 - (arr.length * 50 / 2));

            // Додаємо до сцени
            root.getChildren().addAll(bars[i], indexLabels[i]);
        }

        // Таймлайн для анімації кроків пошуку
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> {
                    if (!searchComplete) {
                        binarySearchStep();  // Крок пошуку
                        updateVisualization();  // Оновлення візуалізації
                    }
                })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);  // Виконуємо цикл поки не завершимо пошук
        timeline.play();  // Початок анімації

        // Налаштування сцени та запуск програми
        Scene scene = new Scene(root, 800, 400);
        primaryStage.setTitle("Binary Search Visualization");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void binarySearchStep() {
        // Бінарний пошук з поступовим відображенням результату
        if (low <= high && !searchComplete) {
            mid = (low + high) / 2;  // Обчислення середини
            // Зміна кольору усіх елементів на світло-синій перед кожним кроком
            for (int i = 0; i < arr.length; i++) {
                bars[i].setFill(Color.LIGHTBLUE);
            }
            // Якщо елемент знайдений
            if (arr[mid] == target) {
                bars[mid].setFill(Color.GREEN);  // Знайдений елемент, зелений
                searchComplete = true;  // Завершуємо пошук
            } else if (arr[mid] < target) {
                low = mid + 1;  // Пошук у правій частині
                bars[mid].setFill(Color.RED);  // Поточний елемент, червоний
                for (int i = low; i <= high; i++) {
                    if (i != mid) {
                        bars[i].setFill(Color.PINK);  // Пошук у правій частині, рожевий
                    }
                }
            } else {
                high = mid - 1;  // Пошук у лівій частині
                bars[mid].setFill(Color.RED);  // Поточний елемент, червоний
                for (int i = low; i <= high; i++) {
                    if (i != mid) {
                        bars[i].setFill(Color.PINK);  // Пошук у лівій частині, рожевий
                    }
                }
            }
        }
    }

    private void updateVisualization() {
        // Відновлення кольору для всіх елементів після кроку
        for (int i = 0; i < arr.length; i++) {
            if (bars[i].getFill() != Color.GREEN) {
                bars[i].setFill(Color.LIGHTBLUE);  // Відновлюємо колір для елементів, які не перевірялися
            }
        }
    }

    public static void main(String[] args) {
        launch(args);  // Запуск JavaFX програми
    }
}
