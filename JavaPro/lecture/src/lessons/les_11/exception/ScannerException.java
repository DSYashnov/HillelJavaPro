package lessons.les_11.exception;

import java.util.Scanner;

public class ScannerException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean correct = false;
        System.out.print("Enter number: ");
        String str;
        do {
            str = s.nextLine();
            correct = false;
            try {
                Double.parseDouble(str);
            } catch (NumberFormatException ex) {
                System.out.println(str + " invalid number, enter correct value");
                correct = true;
            }
        } while (correct);
        System.out.println(str);
    }
}
