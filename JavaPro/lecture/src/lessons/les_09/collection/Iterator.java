package lessons.les_09.collection;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("g");

        java.util.Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            if(s.equals("b"))
                iterator.remove();
            System.out.println(s);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("c")){
                list.remove(i);
            }
        }

        System.out.println(list);

        list.removeIf(s->s.equals("e"));

        System.out.println(list);
    }
}
