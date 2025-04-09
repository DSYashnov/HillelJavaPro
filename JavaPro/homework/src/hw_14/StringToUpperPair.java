package hw_14;
import java.util.List;
import java.util.stream.Collectors;
    class Pair {
        private final String key;
        private final String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " : " + value + "}";
        }
    }

    public class StringToUpperPair {
        public static void main(String[] args) {
            List<String> words = List.of("one", "two", "three");

            List<Pair> result = words.stream()
                    .map(s -> new Pair(s, s.toUpperCase()))
                    .collect(Collectors.toList());

            System.out.println(result);
        }
    }
    