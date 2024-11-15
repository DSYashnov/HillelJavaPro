package lessons.les_08.list;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("one");
        stack.add("two");
        stack.add(0, "three");

        System.out.println(stack.peek());
        System.out.println(stack);
        String i = stack.pop();

        System.out.println(i);
        System.out.println(stack);

        stack.push("four");
        stack.add("five");
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
