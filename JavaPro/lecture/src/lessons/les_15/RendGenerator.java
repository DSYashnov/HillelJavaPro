package lessons.les_15;

import java.util.Random;

public class RendGenerator {
    public static void main(String[] args) {
        Random r = new Random();
        r.ints(1, 100).limit(5).forEach(System.out::println);
    }

}
