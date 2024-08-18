package hw_05.figure;

import java.util.Scanner;

public class Rectangle implements SquareEx{
    private double length;
    private double width;
    private double square;

    public Rectangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first side of rectangle: ");
        this.length = s.nextDouble();
        System.out.print("Enter second side of rectangle: ");
        this.width = s.nextDouble();
        this.square = square();
    }

    @Override
    public double square() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle with sides: " + length + " and " + width + " has area: " + square;
    }
}
