package hw_09.ex_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<WordOccurrence> findOccurrence (ArrayList<String> list) {
        ArrayList<WordOccurrence> occurrences = new ArrayList<>();

        for (String word : list) {
            boolean found = false;
            for (WordOccurrence occurrence : occurrences) {
                if (occurrence.name.equals(word)) {
                    occurrence.occurrence++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                occurrences.add(new WordOccurrence(word, 1));
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("bird", "fox", "cat", "bird", "cat", "bird"));

        ArrayList<WordOccurrence> result = findOccurrence(words);

        System.out.println(result);
    }
}
