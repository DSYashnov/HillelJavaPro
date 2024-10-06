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
        LinkedList ??? 0(n) = 0(1) + 0(n)
         */

    public static void main(String[] args) {
     List<String> al=  new ArrayList<>();
     List<String> ll = new LinkedList<>();

     int listSize = 1_000_000;
     int inputSize = 50_000;
     int count = 5;

        for (int j = 0; j < count; j++) {
            for (int i = 0; i < listSize; i++) {
                al.clear();
                ll.clear();
                al.add("al_" + i);
                ll.add("ll_" + i);
            }
            System.out.println("Номер спроби #" + j + "-------------------------");
            Long start = System.currentTimeMillis();
            for (int i = 0; i < inputSize; i++) {
                al.add(al.size()/2, "al_add_" + i);
            }
            System.out.println("Al add duration : " + (System.currentTimeMillis() - start));

            start = System.currentTimeMillis();

            for (int i = 0; i < inputSize; i++) {
                ll.add(ll.size(), "ll_add_" + i);
            }
            System.out.println("LL add duration : " + (System.currentTimeMillis() - start));
            System.out.println();
        }
    }
}
