package hw_09.ex_02;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        int arr[] = {1, 2,56, 34, 34, 3, 4,5, 6,};
        System.out.println(toList(arr));

    }
    public static ArrayList<Integer> toList (int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int ar : arr){
            list.add(ar);
        }
        return list;
    }
}
