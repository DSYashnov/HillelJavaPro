package hw_14;

import java.util.List;

public class StringFilter {
    public static void main(String[] args) {
        List<String> words = List.of("java", "Code", "tree", "car", "home", "DOG", "bike");

        words.stream()
                .filter(s -> s.equals(s.toLowerCase())) // Проверяем, что строка в нижнем регистре
                .filter(s -> s.length() == 4)           // Проверяем, что длина строки = 4
                .forEach(System.out::println);          // Выводим результат
    }
}
