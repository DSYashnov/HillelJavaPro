package stacKQueue.second;

import java.util.*;

public class AdvancedStackQueueAnalyzer {

    public static void main(String[] args) {
        // Розміри для тестування
        int[] sizes = {10, 100, 1000, 10000, 100000, 1000000};

        // Тестування стеку
        for (int size : sizes) {
            analyzeStack(size);
        }

        // Тестування черги
        for (int size : sizes) {
            analyzeQueue(size);
        }

        // Тестування пріоритетної черги
        for (int size : sizes) {
            analyzePriorityQueue(size);
        }
    }

    private static void analyzeStack(int size) {
        Stack<Integer> stack = new Stack<>();

        // Вставка
        long insertStart = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            stack.push(i);
        }
        long insertEnd = System.currentTimeMillis();

        // Видалення
        long removeStart = System.currentTimeMillis();
        while (!stack.isEmpty()) {
            stack.pop();
        }
        long removeEnd = System.currentTimeMillis();

        // Пошук
        for (int i = 0; i < size; i++) {
            stack.push(i);
        }
        long searchStart = System.currentTimeMillis();
        stack.search(size / 2); // Пошук елемента посередині
        long searchEnd = System.currentTimeMillis();

        System.out.printf("Stack,%d,%d,%d,%d%n", size, (insertEnd - insertStart), (removeEnd - removeStart), (searchEnd - searchStart));
    }

    private static void analyzeQueue(int size) {
        Queue<Integer> queue = new LinkedList<>();

        // Вставка
        long insertStart = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            queue.add(i);
        }
        long insertEnd = System.currentTimeMillis();

        // Видалення
        long removeStart = System.currentTimeMillis();
        while (!queue.isEmpty()) {
            queue.poll();
        }
        long removeEnd = System.currentTimeMillis();

        // Пошук
        for (int i = 0; i < size; i++) {
            queue.add(i);
        }
        long searchStart = System.currentTimeMillis();
        for (int element : queue) {
            if (element == size / 2) break;
        }
        long searchEnd = System.currentTimeMillis();

        System.out.printf("Queue,%d,%d,%d,%d%n", size, (insertEnd - insertStart), (removeEnd - removeStart), (searchEnd - searchStart));
    }

    private static void analyzePriorityQueue(int size) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Вставка
        long insertStart = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            priorityQueue.add(i);
        }
        long insertEnd = System.currentTimeMillis();

        // Видалення
        long removeStart = System.currentTimeMillis();
        while (!priorityQueue.isEmpty()) {
            priorityQueue.poll();
        }
        long removeEnd = System.currentTimeMillis();

        // Пошук
        for (int i = 0; i < size; i++) {
            priorityQueue.add(i);
        }
        long searchStart = System.currentTimeMillis();
        for (int element : priorityQueue) {
            if (element == size / 2) break;
        }
        long searchEnd = System.currentTimeMillis();

        System.out.printf("PriorityQueue,%d,%d,%d,%d%n", size, (insertEnd - insertStart), (removeEnd - removeStart), (searchEnd - searchStart));
    }
}

