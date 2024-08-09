package hw_05.Animals;

public class Dog extends Animal {

    public void run(int range) {
        if (range > 500) {
            System.out.println("Собака не може подолати таку дистанцію");
        } else {
            System.out.println(getName() + " пробіг " + range + "м");

        }
    }
}

