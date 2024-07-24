package les_03.tasks;


import java.util.Arrays;

//reverse number 111112344 - 443211111
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 3, 4, 4};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
        public static void reverseArray (int[] arr){
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        }
    }

