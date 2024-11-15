package lessons.les_09.collection;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {
        List<String> str = List.of("1", "2");

        System.out.println(str.getClass().getSimpleName());
    }
}
