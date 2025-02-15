package lessons.les_08.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        System.out.println(strList.isEmpty());
        System.out.println(strList.size());

        strList.add("1");
        strList.add("2");
        strList.add("3");

        System.out.println(strList);

        System.out.println(strList.isEmpty());
        System.out.println(strList.size() == 0);
        System.out.println(strList.size());

        strList.add(1, "2a");

        System.out.println(strList);

        System.out.println(strList.isEmpty());
        System.out.println(strList.size() == 0);
        System.out.println(strList.size());


        System.out.println(strList.hashCode());

        List<String> str = List.of("4", "5");

        System.out.println(strList);
        System.out.println(strList.hashCode());
        System.out.println(strList.containsAll(str));

        strList.remove("1");
        System.out.println(strList);

        strList.removeIf(s ->s.equals("2"));
        System.out.println(strList);

        strList.add("1");
        strList.add("1");
        strList.add("1");
        System.out.println(strList);

        System.out.println(str.containsAll(strList));

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        System.out.println(l.size());

        for (Integer i : l){
            System.out.println(i);
        }
    }
}
