package les_07.enumerator;

public class EnumeratorRunEx {
    public static void main(String[] args) {
        for (Enumerator en : Enumerator.values()) {
            System.out.println(en);
        }
        System.out.println(Enumerator.valueOf("ACTIVE"));
        System.out.println(Enumerator.valueOf("ACTIVE"));
    }
}
