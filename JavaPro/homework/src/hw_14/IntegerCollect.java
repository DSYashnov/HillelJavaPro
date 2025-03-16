package hw_14;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollect {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        double average = list.stream()
                .mapToInt(Integer::intValue)  // Преобразуем в IntStream
                .average()                    // Вычисляем среднее
                .orElse(0);              // Значение по умолчанию, если список пуст

        System.out.println("Среднее значение: " + average);
    }
}
