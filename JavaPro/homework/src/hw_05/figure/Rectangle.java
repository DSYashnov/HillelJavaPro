package hw_05.figure;

import java.util.Scanner;

public class Rectangle implements SquareEx{
    @Override
    public double square() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first side cube: ");
        double a = s.nextDouble();
        System.out.print("Enter second side cube: ");
        double b = s.nextDouble();
        double square = a * b;
        return square;
    }
}
