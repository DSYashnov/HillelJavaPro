package lessons.les_09.task;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberRemover {
    public static void main(String[] args) {
        Integer[] mass = {1, 2, 3, 4, 5, 4, 5, 6, 4};
        System.out.println(Arrays.deepToString(removeNumberFromArray(mass, 4)));
    }

    public static Integer[] removeNumberFromArray(Integer[] mass, Integer value) {
        List<Integer> list = new ArrayList(Arrays.asList(mass));
        list.removeIf(value::equals);
        return  list.toArray(new Integer[list.size()]);
    }
}
