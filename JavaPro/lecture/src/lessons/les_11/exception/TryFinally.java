package lessons.les_11.exception;


public class TryFinally {
    public static void main(String[] args) {
        System.out.println(validate());
    }
    private static Boolean validate () {
        try {
            System.out.println("1");
//            throw new RuntimeException();
//            System.exit(1);
            return true;
//        } catch (RuntimeException ex) {
//            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("2");
            return true;
        }
    }
}
