package lessons.les_16.io;

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value: ");

        if (s.hasNextInt()) {
            System.out.println(s.nextInt());
        } else {
            System.out.println("invalid value");
        }
    }
}
