package hw_02.part_3;


//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//    public class JavaFXInvestor extends Application {
//
//        public static void main(String[] args) {
//            Application.launch(args);
//        }
//
//        @Override
//        public void start(Stage primaryStage) {
//            primaryStage.setTitle("Обчислення складних відсотків");
//
//            // Labels and TextFields for input
//            Label labelFirstSum = new Label("Введіть початкову суму вкладу:");
//            TextField textFirstSum = new TextField();
//
//            Label labelYearsPercent = new Label("Річна ставка (у десятковому вигляді, наприклад 0.05 для 5%):");
//            TextField textYearsPercent = new TextField();
//
//            Label labelYears = new Label("Кількість років:");
//            TextField textYears = new TextField();
//
//            Button calculateButton = new Button("Обчислити");
//
//            // Label for output
//            Label outputLabel = new Label();
//
//            calculateButton.setOnAction(e -> {
//                try {
//                    double firstSum = Double.parseDouble(textFirstSum.getText());
//                    double yearsPercent = Double.parseDouble(textYearsPercent.getText());
//                    int years = Integer.parseInt(textYears.getText());
//                    int capital = 12; // Кількість капіталізацій на рік (щомісячно)
//
//                    StringBuilder result = new StringBuilder();
//                    for (int t = 1; t <= years; t++) {
//                        double accumulatedSum = firstSum * Math.pow(1 + yearsPercent / capital, capital * t);
//                        double interestEarned = accumulatedSum - firstSum;
//                        result.append("Рік ").append(t).append(":\n");
//                        result.append("Накопичена сума: ").append(String.format("%.2f", accumulatedSum)).append(" грн\n");
//                        result.append("Нараховані відсотки: ").append(String.format("%.2f", interestEarned)).append(" грн\n\n");
//                    }
//                    outputLabel.setText(result.toString());
//                } catch (NumberFormatException ex) {
//                    outputLabel.setText("Будь ласка, введіть коректні значення.");
//                }
//            });
//
//            // Layout
//            VBox layout = new VBox(10);
//            layout.setPadding(new Insets(20));
//            layout.getChildren().addAll(labelFirstSum, textFirstSum, labelYearsPercent, textYearsPercent, labelYears, textYears, calculateButton, outputLabel);
//
//            Scene scene = new Scene(layout, 400, 400);
//            primaryStage.setScene(scene);
//            primaryStage.show();
//        }
//    }

