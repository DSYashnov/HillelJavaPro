//package stacKQueue;
//
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
//import javafx.scene.control.TextArea;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class QueueVisualizer {
//    public void runResearch(TextArea outputArea, VBox visualizerArea) {
//        outputArea.clear();
//        visualizerArea.getChildren().clear();
//
//        outputArea.appendText("Запуск дослідження черги...\n");
//
//        Queue<Integer> queue = new LinkedList<>();
//        long startTime, endTime;
//
//        // Операція додавання
//        outputArea.appendText("Додавання елементів...\n");
//        startTime = System.nanoTime();
//        for (int i = 0; i < 10000; i++) {
//            queue.add(i);
//        }
//        endTime = System.nanoTime();
//        outputArea.appendText("Час додавання: " + (endTime - startTime) + " нс\n");
//
//        // Операція перегляду першого елементу
//        outputArea.appendText("Перегляд першого елементу...\n");
//        startTime = System.nanoTime();
//        int first = queue.peek();
//        endTime = System.nanoTime();
//        outputArea.appendText("Перший елемент: " + first + ", Час перегляду: " + (endTime - startTime) + " нс\n");
//
//        // Операція видалення
//        outputArea.appendText("Видалення елементів...\n");
//        startTime = System.nanoTime();
//        while (!queue.isEmpty()) {
//            queue.poll();
//        }
//        endTime = System.nanoTime();
//        outputArea.appendText("Час видалення: " + (endTime - startTime) + " нс\n");
//
//        // Візуалізація
//        visualizerArea.getChildren().add(new Text("Черга:"));
//        for (int i = 1; i <= 10; i++) {
//            Text block = new Text("Елемент " + i);
//            block.setStyle("-fx-border-color: green; -fx-padding: 5; -fx-background-color: lightgreen;");
//            visualizerArea.getChildren().add(block);
//        }
//    }
//}
//
