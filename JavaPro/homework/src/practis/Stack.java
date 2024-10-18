package practis;

public class Stack {
    private int[] elements;
    private int top;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        elements = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            throw new StackOverflowError("Стек переповнений");
        }
        elements[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Стек порожній");
        }
        return elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Стек порожній");
        }
        return elements[top];
    }
}
