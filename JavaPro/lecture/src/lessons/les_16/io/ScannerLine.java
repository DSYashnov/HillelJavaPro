package lessons.les_16.io;

import java.util.Scanner;

public class ScannerLine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "a";
        System.out.println("enter value...");
        while (!str.equals("Q")) {
            str = s.nextLine();
            System.out.println("---> " + str);
        }
    }
}
