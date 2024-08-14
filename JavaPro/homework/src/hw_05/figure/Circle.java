package hw_05.figure;

import java.util.Scanner;

public class Circle implements SquareEx{
    @Override
    public double square() {
        final double PI = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius in circle: ");
        double r = s.nextDouble();
        double squareCircle = PI*(r*r);
        return squareCircle;
    }
}
