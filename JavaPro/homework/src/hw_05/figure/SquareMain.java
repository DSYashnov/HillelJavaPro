package hw_05.figure;

import java.util.Arrays;

public class SquareMain {
    public static void main(String[] args) {
        Object[] arrayFigure = new Object[3];

        Circle cr = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        arrayFigure[0] = cr;
        arrayFigure[1] = triangle;
        arrayFigure[2] = rectangle;

        for (Object obj : arrayFigure) {
            System.out.println(obj.toString());
        }
        System.out.println(sumArray(arrayFigure));

    }
    public static double sumArray (Object[] objects){
        double arraySum = 0;

        for (Object obj : objects){
            if(obj instanceof SquareEx){
                SquareEx shape = (SquareEx) obj;
                arraySum += shape.square();
            }
        }
        return arraySum;
    }
}


