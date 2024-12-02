//package stacKQueue;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.stage.Stage;
//
//public class MainApp extends Application {
//
//    private StackVisualizer stackVisualizer = new StackVisualizer();
//    private QueueVisualizer queueVisualizer = new QueueVisualizer();
//
//    @Override
//    public void start(Stage primaryStage) {
//        // Створення інтерфейсу
//        Label titleLabel = new Label("Дослідження стеку та черги");
//        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
//
//        ComboBox<String> structureSelector = new ComboBox<>();
//        structureSelector.getItems().addAll("Стек", "Черга");
//        structureSelector.setValue("Стек");
//
//        Button runButton = new Button("Запустити дослідження");
//        runButton.setStyle("-fx-font-size: 14px; -fx-background-color: #4CAF50; -fx-text-fill: white;");
//
//        TextArea outputArea = new TextArea();
//        outputArea.setEditable(false);
//        outputArea.setPrefHeight(300);
//
//        VBox visualizerArea = new VBox();
//        visualizerArea.setStyle("-fx-border-color: gray; -fx-border-width: 1; -fx-padding: 10;");
//        visualizerArea.setPrefHeight(200);
//
//        runButton.setOnAction(event -> {
//            String selectedStructure = structureSelector.getValue();
//            if (selectedStructure.equals("Стек")) {
//                stackVisualizer.runResearch(outputArea, visualizerArea);
//            } else {
//                queueVisualizer.runResearch(outputArea, visualizerArea);
//            }
//        });
//
//        VBox layout = new VBox(10, titleLabel, structureSelector, runButton, visualizerArea, outputArea);
//        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");
//        Scene scene = new Scene(layout, 600, 500);
//
//        primaryStage.setTitle("Дослідження стеку та черги");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//
//
