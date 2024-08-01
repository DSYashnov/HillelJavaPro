package hw_05.Animals;

public class AnimalMain {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.run(151);
        Cat cat = new Cat();
        cat.run(150);
        Dog dog = new Dog();
        dog.setName("Bobik");
        dog.run(499);
    }
}
