package practis;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Practis {

        private static final int SIZE = 100_000;

        public static void main(String[] args) {
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            System.out.println("=== Додавання елементів ===");
            testAdd(arrayList, "ArrayList");
            testAdd(linkedList, "LinkedList");

            System.out.println("\n=== Доступ до елементів ===");
            testGet(arrayList, "ArrayList");
            testGet(linkedList, "LinkedList");

            System.out.println("\n=== Видалення елементів ===");
            testRemove(arrayList, "ArrayList");
            testRemove(linkedList, "LinkedList");
        }

        private static void testAdd(List<Integer> list, String type) {
            long startTime = System.nanoTime();
            for (int i = 0; i < SIZE; i++) {
                list.add(i);  // Додавання в кінець
            }
            long endTime = System.nanoTime();
            System.out.println(type + " - Додавання в кінець: " + (endTime - startTime) / 1_000_000 + " мс");
        }

        private static void testGet(List<Integer> list, String type) {
            long startTime = System.nanoTime();
            for (int i = 0; i < SIZE; i++) {
                list.get(i);  // Доступ за індексом
            }
            long endTime = System.nanoTime();
            System.out.println(type + " - Доступ за індексом: " + (endTime - startTime) / 1_000_000 + " мс");
        }

        private static void testRemove(List<Integer> list, String type) {
            long startTime = System.nanoTime();
            while (!list.isEmpty()) {
                list.remove(0);  // Видалення з початку
            }
            long endTime = System.nanoTime();
            System.out.println(type + " - Видалення з початку: " + (endTime - startTime) / 1_000_000 + " мс");
        }
    }

