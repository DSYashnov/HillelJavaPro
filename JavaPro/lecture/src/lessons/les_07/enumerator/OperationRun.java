package lessons.les_07.enumerator;

public class OperationRun {
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.calculate(1, 2));
        System.out.println(Operation.MINUS.calculate(1, 2));
        System.out.println(Operation.MULTI.calculate(1, 2));
        System.out.println(Operation.DIVIDE.calculate(1, 2));
    }
}
