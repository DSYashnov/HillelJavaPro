package hw_05.figure;

import java.util.Arrays;

public class SquareMain {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println("Площа круга: " + circle.square());
//
//        Triangle triangle = new Triangle();
//        System.out.println("Площа трикутника: " + triangle.square());
//
//        Rectangle rectangle = new Rectangle();
//        System.out.println("Площа прямокутника: " + rectangle.square());
//
        double rand;

        rand = Math.random() * 3+1;  // Генерує випадкове число від 0.0 до 2.999...

        if (rand < 1) {
            new Circle();
            System.out.println("Створено коло");
        } else if (rand < 2) {
            new Triangle();
            System.out.println("Створено трикутник");
        } else {
            new Rectangle();
            System.out.println("Створено прямокутник");
        }

        // Зберігаємо випадкове число в масиві
        double[] figure = {rand};
        System.out.println("Згенероване випадкове число: " + Arrays.toString(figure));
    }
}


