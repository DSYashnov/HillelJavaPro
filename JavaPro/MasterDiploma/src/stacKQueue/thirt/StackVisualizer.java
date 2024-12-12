//package stacKQueue;
//
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
//import javafx.scene.control.TextArea;
//
//import java.util.Stack;
//
//public class StackVisualizer {
//    public void runResearch(TextArea outputArea, VBox visualizerArea) {
//        outputArea.clear();
//        visualizerArea.getChildren().clear();
//
//        outputArea.appendText("Запуск дослідження стеку...\n");
//
//        Stack<Integer> stack = new Stack<>();
//        long startTime, endTime;
//
//        // Операція додавання
//        outputArea.appendText("Додавання елементів...\n");
//        startTime = System.nanoTime();
//        for (int i = 0; i < 10000; i++) {
//            stack.push(i);
//        }
//        endTime = System.nanoTime();
//        outputArea.appendText("Час додавання: " + (endTime - startTime) + " нс\n");
//
//        // Операція перегляду вершини
//        outputArea.appendText("Перегляд вершини...\n");
//        startTime = System.nanoTime();
//        int top = stack.peek();
//        endTime = System.nanoTime();
//        outputArea.appendText("Вершина: " + top + ", Час перегляду: " + (endTime - startTime) + " нс\n");
//
//        // Операція видалення
//        outputArea.appendText("Видалення елементів...\n");
//        startTime = System.nanoTime();
//        while (!stack.isEmpty()) {
//            stack.pop();
//        }
//        endTime = System.nanoTime();
//        outputArea.appendText("Час видалення: " + (endTime - startTime) + " нс\n");
//
//        // Візуалізація
//        visualizerArea.getChildren().add(new Text("Стек:"));
//        for (int i = 10; i > 0; i--) {
//            Text block = new Text("Елемент " + i);
//            block.setStyle("-fx-border-color: blue; -fx-padding: 5; -fx-background-color: lightblue;");
//            visualizerArea.getChildren().add(block);
//        }
//    }
//}
//
