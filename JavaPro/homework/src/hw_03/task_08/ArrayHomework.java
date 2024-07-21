package hw_03.task_08;

import java.util.Arrays;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int i = 0; i < arr.length; i++) {
            int tmp;
            tmp = arr[i];
            System.out.print(tmp);
            if (i < arr.length - 1){
                System.out.print(", ");
            }
        }
    }
}
