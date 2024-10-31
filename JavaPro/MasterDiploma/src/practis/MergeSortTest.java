package practis;

import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] data = {38, 27, 43, 3, 9, 82, 10};
        MergeSort sorter = new MergeSort();

        long startTime = System.nanoTime();
        sorter.sort(data);
        long endTime = System.nanoTime();

        System.out.println("Відсортований масив: " + Arrays.toString(data));
        System.out.println("Час сортування: " + (endTime - startTime) + " наносекунд");
    }
}

