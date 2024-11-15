package lessons.les_11.exception;

public class TryFinally1 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("test");
        } finally {
            System.out.println("finaly");
        }
    }
}
