package practis;

import java.util.Arrays;

public class BinarySearch {
        public static void main(String[] args) {
            int[] array = new int[1_000_000];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }

            int target = 999_999;
            long start = System.currentTimeMillis();
            int result = Arrays.binarySearch(array, target);
            System.out.println("Found at index: " + result);
            System.out.println("Duration: " + (System.currentTimeMillis() - start) + " ms");
        }
    }

