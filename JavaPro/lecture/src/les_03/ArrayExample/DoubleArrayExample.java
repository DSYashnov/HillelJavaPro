package les_03.ArrayExample;

import java.util.Arrays;

public class DoubleArrayExample {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < 3; i++) { //stroka
            for (int j = 0; j < 3; j++) {//stolbec
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr.length);

        System.out.println("-------------");
        System.out.println(Arrays.deepToString(arr));
    }
    int [][] arr1 = new int[4][4];
}
