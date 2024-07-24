package hw_03.task_07;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        table(number);
    }
    public static void table (int x){
        for (int i = 0; i <= 10; i++) {
                System.out.println(i + " * " + x + " = " + i * x);
            }
        }
    }

