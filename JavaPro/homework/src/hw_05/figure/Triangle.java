package hw_05.figure;

import java.util.Scanner;

public class Triangle implements SquareEx {
    @Override
    public double square() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first side triangle: ");
        double a = s.nextDouble();
        System.out.print("Enter second side triangle: ");
        double b = s.nextDouble();
        System.out.print("Enter three side triangle: ");
        double c = s.nextDouble();
        double perimeterTrinagle = (a + b + c)/2;
        double beforeSquare = perimeterTrinagle *(perimeterTrinagle -a)*(perimeterTrinagle -b)*(perimeterTrinagle -c);
        double square = Math.sqrt(beforeSquare);
        return square;
    }
}
