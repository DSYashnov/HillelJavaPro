package lessons.les_15;

import java.util.List;
import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
//        List<String> str1 = List.of("1", "2", "3");
//        List<String> str2 = List.of("1", "2", "3");
//
//        Stream.concat(str1.stream(), str2.stream()).forEach(System.out::println);

        Stream<Integer> int1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(e -> e % 2 == 0);
        Stream<Integer> int2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(e -> e * 2);
        Stream.concat(int1, int2).map(e -> e * 2).forEach(System.out::println);
    }
}
