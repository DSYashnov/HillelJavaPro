package hw_05.figure;

import java.util.Scanner;

public class Circle implements SquareEx{
    private double radius;
    private double square;

    public Circle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius in circle: ");
        this.radius = s.nextDouble();
        this.square = square();
    }

    @Override
    public double square() {
        final double PI = 3.14;
        return PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius + " has area: " + square;
    }
}
