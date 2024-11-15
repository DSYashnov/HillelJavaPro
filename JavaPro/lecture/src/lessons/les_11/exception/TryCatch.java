package lessons.les_11.exception;

public class TryCatch {
    public static void main(String[] args) {
        if (true){
            throw new RuntimeException();
        }
        try {
            System.out.println("1");
//            if (true)
                if (false)
                throw new RuntimeException();
                System.out.println("2");
            } catch (RuntimeException ex) {
            System.out.println("3");
            } finally {
            System.out.println("4");
        }
        //Thread.sleep(50);
        System.out.println("5");
    }
}

