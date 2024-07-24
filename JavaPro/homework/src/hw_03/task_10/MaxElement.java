package hw_03.task_10;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter length arrays: ");
        int number = s.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            double rand = Math.random() * number;
            arr[i] = (int) rand;
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        int max = arr[number-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > max){
                max = arr[0];
            }
        }
        System.out.println();
        System.out.println("max value: " + max);
    }
}

