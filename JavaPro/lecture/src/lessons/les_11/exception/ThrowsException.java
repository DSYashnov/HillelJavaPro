package lessons.les_11.exception;

public class ThrowsException {
    public static void main(String[] args) {
        try {
            new People().print();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("sssss");
    }
}

