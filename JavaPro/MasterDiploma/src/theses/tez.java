package theses;
import java.util.Arrays;
public class tez {
        public static int[] parallelMergeSort(int[] array) {
            if (array.length <= 1) {
                return array;
            }

            // Знаходимо середину масиву
            int mid = array.length / 2;

            // Розбиваємо масив та сортуємо ліву і праву частини паралельно
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            // Паралельне сортування з використанням Stream API
            left = Arrays.stream(left).parallel().sorted().toArray();
            right = Arrays.stream(right).parallel().sorted().toArray();

            // Зливаємо відсортовані частини
            return merge(left, right);
        }

        // Метод злиття двох відсортованих масивів
        private static int[] merge(int[] left, int[] right) {
            int[] result = new int[left.length + right.length];
            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    result[k++] = left[i++];
                } else {
                    result[k++] = right[j++];
                }
            }

            while (i < left.length) {
                result[k++] = left[i++];
            }

            while (j < right.length) {
                result[k++] = right[j++];
            }

            return result;
        }

        public static void main(String[] args) {
            // Генеруємо великий масив випадкових чисел
            int[] array = new int[100000];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100000);
            }

            // Вимірюємо час початку виконання
            long startTime = System.nanoTime();

            // Виконуємо паралельне сортування
            int[] sortedArray = parallelMergeSort(array);

            // Вимірюємо час завершення
            long endTime = System.nanoTime();

            // Виводимо результати
            System.out.println("Час виконання: " + (endTime - startTime) / 1_000_000 + " мс");
        }
    }

