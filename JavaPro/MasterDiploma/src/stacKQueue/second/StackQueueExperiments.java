package stacKQueue.second;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class StackQueueExperiments {

    public static void main(String[] args) {
        System.out.println("Stack and Queue Experimentation");
        System.out.println("----------------------------------------------------");

        // Вибір розміру структури
        int[] sizes = {1000, 10_000, 100_000, 1_000_000};

        // Дослідження стеку
        System.out.println("\n--- Stack Experiments ---");
        for (int size : sizes) {
            System.out.println("Testing Stack with size: " + size);
            testStack(size);
        }

        // Дослідження черги
        System.out.println("\n--- Queue Experiments ---");
        for (int size : sizes) {
            System.out.println("Testing Queue with size: " + size);
            testQueue(size);
        }
    }

    private static void testStack(int size) {
        // Реалізація через стандартний стек
        Stack<Integer> stack = new Stack<>();
        Random random = new Random();

        // Додавання елементів
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            stack.push(random.nextInt());
        }
        long endTime = System.nanoTime();
        long pushTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        // Видалення елементів
        startTime = System.nanoTime();
        while (!stack.isEmpty()) {
            stack.pop();
        }
        endTime = System.nanoTime();
        long popTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("Push time: " + pushTime + " ms");
        System.out.println("Pop time: " + popTime + " ms");
    }

    private static void testQueue(int size) {
        // Реалізація через LinkedList
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random();

        // Додавання елементів
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            queue.add(random.nextInt());
        }
        long endTime = System.nanoTime();
        long enqueueTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        // Видалення елементів
        startTime = System.nanoTime();
        while (!queue.isEmpty()) {
            queue.poll();
        }
        endTime = System.nanoTime();
        long dequeueTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("Enqueue time: " + enqueueTime + " ms");
        System.out.println("Dequeue time: " + dequeueTime + " ms");
    }
}

