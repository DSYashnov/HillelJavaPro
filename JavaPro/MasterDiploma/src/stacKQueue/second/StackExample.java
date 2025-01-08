//package stacKQueue.second;
//
//import java.util.Stack;
//
//public class StackExample {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println("Верхній елемент: " + stack.peek());
//        System.out.println("Видалено: " + stack.pop());
//        System.out.println("Новий верхній елемент: " + stack.peek());
//    }
//}
//
//stack = []
//        stack.append(10)
//stack.append(20)
//stack.append(30)
//
//print("Верхній елемент:", stack[-1])
//print("Видалено:", stack.pop())
//print("Новий верхній елемент:", stack[-1])
//
//#include <iostream>
//#include <stack>
//
//int main() {
//    std::stack<int> stack;
//    stack.push(10);
//    stack.push(20);
//    stack.push(30);
//
//    std::cout << "Верхній елемент: " << stack.top() << std::endl;
//    stack.pop();
//    std::cout << "Новий верхній елемент: " << stack.top() << std::endl;
//
//    return 0;
//}
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class QueueExample {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//
//        System.out.println("Перший елемент: " + queue.peek());
//        System.out.println("Видалено: " + queue.poll());
//        System.out.println("Новий перший елемент: " + queue.peek());
//    }
//}
//from collections import deque
//
//        queue = deque()
//queue.append(10)
//queue.append(20)
//queue.append(30)
//
//print("Перший елемент:", queue[0])
//print("Видалено:", queue.popleft())
//print("Новий перший елемент:", queue[0])
//
//#include <iostream>
//#include <queue>
//
//int main() {
//    std::queue<int> queue;
//    queue.push(10);
//    queue.push(20);
//    queue.push(30);
//
//    std::cout << "Перший елемент: " << queue.front() << std::endl;
//    queue.pop();
//    std::cout << "Новий перший елемент: " << queue.front() << std::endl;
//
//    return 0;
//}
//
//import java.util.HashSet;
//
//public class SetExample {
//    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(20);
//        set.add(30);
//
//        System.out.println("Множина містить 20: " + set.contains(20));
//        set.remove(20);
//        System.out.println("Множина після видалення 20: " + set);
//    }
//}
//set_example = {10, 20, 30}
//
//print("Множина містить 20:", 20 in set_example)
//set_example.remove(20)
//print("Множина після видалення 20:", set_example)
//
//#include <iostream>
//#include <set>
//
//int main() {
//    std::set<int> set_example;
//    set_example.insert(10);
//    set_example.insert(20);
//    set_example.insert(30);
//
//    std::cout << "Множина містить 20: " << (set_example.count(20) ? "Так" : "Ні") << std::endl;
//    set_example.erase(20);
//    std::cout << "Множина після видалення 20: ";
//    for (int num : set_example) {
//        std::cout << num << " ";
//    }
//    std::cout << std::endl;
//
//    return 0;
//}
