package hw_05.Animals;

public class Cat extends Animal{
    public static int count = 0;

    Cat(String name){
        this.name = name;
    }

    @Override
    public void run(int range) {
        if (range > 150) {
            System.out.println("Кіт не може подолати таку дистанцію");
        } else {
            System.out.println(getName() + " пробіг " + range + "м");
        }
    }
}
