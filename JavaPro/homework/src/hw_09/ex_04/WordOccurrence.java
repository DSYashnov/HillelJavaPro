package hw_09.ex_04;

class WordOccurrence {
        String name;
        int occurrence;

        public WordOccurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }

        @Override
        public String toString() {
            return "{name: \"" + name + "\", occurrence: " + occurrence + "}";
        }
    }

