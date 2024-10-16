package les_08.task;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
        /*
        100_000(List)
        10_000 (покладіть в центр по одному за раз)

        ArrayList ??? 0(n) = 0(1) + 0(n)
        LinkedList ??? 0(n) = 0(1) + 0(1)
         */

        public static void main(String[] args) {
            List<String> arrayList = new ArrayList<>();
            List<String> linkedList = new LinkedList<>();

            int listSize = 1_000_000;  // Початковий розмір списку
            int inputSize = 50_000;    // Кількість елементів для вставки
            int attempts = 5;          // Кількість спроб

            for (int j = 0; j < attempts; j++) {
                // Очищення списків перед кожною спробою
                arrayList.clear();
                linkedList.clear();

                // Заповнення списків
                for (int i = 0; i < listSize; i++) {
                    arrayList.add("al_" + i);
                    linkedList.add("ll_" + i);
                }

                System.out.println("Номер спроби #" + j + " -------------------------");

                // Вставка в середину ArrayList
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < inputSize; i++) {
                    arrayList.add(arrayList.size() / 2, "al_add_" + i);
                }
                System.out.println("ArrayList add duration: " + (System.currentTimeMillis() - startTime) + " ms");

                // Вставка в середину LinkedList
                startTime = System.currentTimeMillis();
                for (int i = 0; i < inputSize; i++) {
                    linkedList.add(linkedList.size() / 2, "ll_add_" + i);
                }
                System.out.println("LinkedList add duration: " + (System.currentTimeMillis() - startTime) + " ms\n");
            }
        }
    }
