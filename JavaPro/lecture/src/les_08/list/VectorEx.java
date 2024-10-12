package les_08.list;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        System.out.println(vector.size());
        System.out.println(vector.add("one"));
        System.out.println(vector.add("two"));
        System.out.println(vector.add(null));
        System.out.println(vector.add("three"));
        System.out.println(vector.size());

        System.out.println(vector);

        vector.remove("one");
        System.out.println(vector.toString());
        System.out.println(vector.size());
        vector.remove(1);
        System.out.println(vector.toString());


        //vector.add(10, "ten");
        System.out.println(vector.toString());


        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
    }
}
