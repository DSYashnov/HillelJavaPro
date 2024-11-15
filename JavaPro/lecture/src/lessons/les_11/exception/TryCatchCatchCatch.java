package lessons.les_11.exception;


public class TryCatchCatchCatch {
    public static void main(String[] args) {
        try {
            switch ("3") {
                case "1": throw new RuntimeException();
                case "2": throw new Exception();
                case "3": throw new Throwable();
                default:
                    System.out.println("some code....");
            }
        } catch (RuntimeException ex) {
            System.err.println("RE");
        } catch (Exception ex) {
            System.err.println("E");
        } catch (Throwable ex) {
            System.err.println("T");
        }
        System.err.println("4");
    }
}
