package hw_03.task_11;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter length array: ");
        int number = s.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            double rand = Math.random() * number;
            arr[i] = (int) rand;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("array after sort: " + Arrays.toString(arr));
        int min = arr[0];
        int max = arr[number - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > max) {
                max = arr[0];
            }
            if (arr[0] < min) {
                min = arr[0];
            }
        }
        int first = 0;
        int last = 0;
        for (int i = 0; i < arr.length; i++) {
            first = max;
            last = min;
            arr[0] = first;
            arr[number-1] = last;
        }
        System.out.println();
        System.out.println("minimal value: " + min);
        System.out.println("max value: " + max);
        System.out.print("array after replace element: " + Arrays.toString(arr));
    }
}
