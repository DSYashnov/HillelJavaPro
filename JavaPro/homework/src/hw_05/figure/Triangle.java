package hw_05.figure;

import java.util.Scanner;

public class Triangle implements SquareEx {
    private double a, b, c;
    private double square;

    public Triangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first side of triangle: ");
        this.a = s.nextDouble();
        System.out.print("Enter second side of triangle: ");
        this.b = s.nextDouble();
        System.out.print("Enter third side of triangle: ");
        this.c = s.nextDouble();
        this.square = square();
    }

    @Override
    public double square() {
        double perimeter = (a + b + c) / 2;
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }

    @Override
    public String toString() {
        return "Triangle with sides: " + a + ", " + b + ", " + c + " has area: " + square;
    }
}

