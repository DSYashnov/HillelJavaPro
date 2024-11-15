package lessons.les_06.task;

import java.util.Arrays;

public class NumberRemover {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 6, 4, 6, 4};
        int number = 4;

        int count = 0;
        for (int i : arr) {
            if (i != number) {
                count++;
            }
        }
        System.out.println(count);


        int[] arrRemove = new int[count];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number){
                arrRemove[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrRemove));
    }
}
