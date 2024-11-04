package hw_09.ex_01;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("n");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("n");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("n");
        System.out.println(countOccurrence(list, "b"));
    }
    public static int countOccurrence(ArrayList<String> ar, String str) {
        int count = 0;
        for (String string : ar){
            if (string.equals(str)) count++;
        }
        return count;
    }
}
