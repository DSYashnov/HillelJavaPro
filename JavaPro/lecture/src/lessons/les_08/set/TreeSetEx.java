package lessons.les_08.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();

        set.add(10);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(3);
        set.add(2);
        set.add(9);
        set.add(0);
        set.add(1);

        System.out.println(set);
        set.add(11);
        System.out.println(set);


        TreeSet<String> ts = new TreeSet<>();

        ts.add("One");
        ts.add("one");
        ts.add("tow");
        ts.add("Tne");
        ts.add("ane");
        ts.add("Bne");

        System.out.println(ts);
    }
}
