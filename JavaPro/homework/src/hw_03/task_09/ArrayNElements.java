package hw_03.task_09;

import java.util.Scanner;

public class ArrayNElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length arrays: ");
        int number = s.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            double rand = Math.random() * number;
            arr[i] = (int) rand;
            System.out.print(arr[i] + " ");
            }
        }
    }

