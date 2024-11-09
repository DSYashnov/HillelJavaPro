package hw_09.ex_04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        calcOccurrence(generateRand());
    }
    public static void calcOccurrence (ArrayList<String> list) {
        ArrayList<String> uniqueWords = new ArrayList<>();
        for (String word : list) {
            int count = 0;
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
                for (String s : list) {
                    if (s.equals(word)) {
                        count++;
                    }
                }
                System.out.println(word + ": " + count);
            }
        }
    }

    public static ArrayList<String> generateRand () {
        Random random = new Random();
        System.out.print("enter length array: ");
        Scanner s = new Scanner(System.in);
        int sizeArr = s.nextInt();
        ArrayList<String> list = new ArrayList<>();

        String[] str = {"a","b","c","d","a","b","c","d","e","f","g","h","i","j","k","l","m","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i < sizeArr; i++) {
            int randomIndex = random.nextInt(str.length);
            list.add(str[randomIndex]);
        }
        System.out.println("generate list" + list);
        return list;
    }

}
