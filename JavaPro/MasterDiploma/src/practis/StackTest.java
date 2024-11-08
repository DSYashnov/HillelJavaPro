package practis;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Верхній елемент: " + stack.peek());
        System.out.println("Витягнутий елемент: " + stack.pop());
        System.out.println("Стек порожній: " + stack.isEmpty());
    }
}

