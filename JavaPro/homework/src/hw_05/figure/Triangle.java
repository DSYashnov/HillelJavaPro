package hw_05.figure;

import java.util.Scanner;

public class Triangle implements SquareEx {
    Scanner s = new Scanner(System.in);
    double a = s.nextDouble();
    double b = s.nextDouble();
    double c = s.nextDouble();
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.square());
    }
    @Override
    public double square() {
        double perimeterTrinagle = (a + b + c)/2;
        double beforeSquare = perimeterTrinagle *(perimeterTrinagle -a)*(perimeterTrinagle -b)*(perimeterTrinagle -c);
        double square = Math.sqrt(beforeSquare);
        return square;
    }
}
