package stacKQueue.second;

import java.util.*;

public class DataStructurePerformance {
    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000, 10000, 100000, 1000000};

        // Стек
        System.out.println("Stack performance:");
        for (int size : sizes) {
            Stack<Integer> stack = new Stack<>();
            measurePerformance("Stack", stack, size);
        }

        // Черга
        System.out.println("\nQueue performance:");
        for (int size : sizes) {
            Queue<Integer> queue = new LinkedList<>();
            measurePerformance("Queue", queue, size);
        }
    }

    private static void measurePerformance(String type, Collection<Integer> structure, int size) {
        long startTime, endTime;

        // Додавання елементів
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            structure.add(i);
        }
        endTime = System.nanoTime();
        System.out.printf("%s (%d elements) - Add: %d ns\n", type, size, (endTime - startTime));

        // Доступ до елемента (Stack: top, Queue: peek)
        if (structure instanceof Stack) {
            Stack<Integer> stack = (Stack<Integer>) structure;
            startTime = System.nanoTime();
            stack.peek();
            endTime = System.nanoTime();
            System.out.printf("%s (%d elements) - Peek: %d ns\n", type, size, (endTime - startTime));
        } else if (structure instanceof Queue) {
            Queue<Integer> queue = (Queue<Integer>) structure;
            startTime = System.nanoTime();
            queue.peek();
            endTime = System.nanoTime();
            System.out.printf("%s (%d elements) - Peek: %d ns\n", type, size, (endTime - startTime));
        }

        // Видалення елементів
        startTime = System.nanoTime();
        structure.clear();
        endTime = System.nanoTime();
        System.out.printf("%s (%d elements) - Remove All: %d ns\n", type, size, (endTime - startTime));
    }
}

