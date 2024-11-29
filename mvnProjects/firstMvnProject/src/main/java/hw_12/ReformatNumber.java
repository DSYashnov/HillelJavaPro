package hw_12;


import java.util.Scanner;

public class ReformatNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        drawSequence(value);
    }

    public static void drawSequence(int number) {
        String numberStr = String.valueOf(number); // Перетворюємо число в рядок
        String[][] digitArt = new String[numberStr.length()][];

        // Створюємо "малюнки" для кожної цифри
        for (int i = 0; i < numberStr.length(); i++) {
            digitArt[i] = reformat(Character.getNumericValue(numberStr.charAt(i)));
        }

        // Поєднуємо рядки для виводу в один рядок
        for (int row = 0; row < 5; row++) { // 5 — кількість рядків у малюнку цифр
            for (String[] art : digitArt) {
                System.out.print(art[row] + "     "); // Друкуємо рядок кожної цифри
            }
            System.out.println(); // Перехід до наступного рядка
        }
    }

    public static String[] reformat(int number) {
        return switch (number) {
            case 7 -> new String[]{
                    "@@@@@@",
                    "   @@",
                    "  @@",
                    " @@",
                    "@@",
            };
            case 5 -> new String[]{
                    "@@@@@@",
                    "@@",
                    "@@@@@",
                    "    @@",
                    "@@@@@"
            };
            case 9 -> new String[]{
                    " @@@@@",
                    "@@   @@",
                    " @@@@@",
                    "   @@",
                    "  @@"
            };
            case 6 -> new String[]{
                    " @@@@@",
                    "@@",
                    "@@@@@",
                    "@@  @@",
                    " @@@@"
            };
            case 1 -> new String[]{
                    "  @@",
                    " @@@",
                    "@ @@",
                    "  @@",
                    "@@@@@@"
            };
            case 3 -> new String[]{
                    "@@@@@@",
                    "    @@",
                    "  @@@@",
                    "    @@",
                    "@@@@@@"
            };
            case 4 -> new String[]{
                    "  @@@@",
                    " @@ @@",
                    "@@  @@",
                    "@@@@@@",
                    "    @@"
            };
            case 8 -> new String[]{
                    " @@@@@ ",
                    "@@   @@",
                    " @@@@@ ",
                    "@@   @@",
                    " @@@@@"
            };
            case 2 -> new String[]{
                    " @@@@@@ ",
                    "@@    @@",
                    "    @@@",
                    " @@@  ",
                    "@@@@@@@@"
            };
            case 0 -> new String[]{
                    "@@@@@@@",
                    "@@   @@",
                    "@@   @@",
                    "@@   @@",
                    "@@@@@@@"
            };
            default -> new String[]{"Number not supported"
            };
        };
    }
}

