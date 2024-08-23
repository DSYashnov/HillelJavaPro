package hw_05.animals;

public class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    @Override
    public void run(int range) {
        if (range > 150) {
            System.out.println("Кіт не може подолати таку дистанцію");
        } else {
            System.out.println(getName() + " пробіг " + range + "м");
        }
    }
    public void swim(int range) {
        System.out.println("Кіт не вміє плавати");
    }
}
