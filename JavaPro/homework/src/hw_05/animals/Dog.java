package hw_05.animals;

public class Dog extends Animal {

    Dog (String name) {
        super(name);
    }
    public void run(int range) {
        if (range > 500) {
            System.out.println("Собака не може подолати таку дистанцію");
        } else {
            System.out.println(getName() + " пробіг " + range + " м ");

        }
    }

    @Override
    public void swim(int range) {
        if (range > 10) {
            System.out.println("Собака не може пропливти таку дистанцію");
        } else {
            System.out.println(getName() +  " проплив " + range + " м ");
        }
    }
}

