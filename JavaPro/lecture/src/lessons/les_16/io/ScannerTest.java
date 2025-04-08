package lessons.les_16.io;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner s = new Scanner("Hello, world, Hello world, Hello wor, ld ");
        s.useDelimiter(", ");
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
