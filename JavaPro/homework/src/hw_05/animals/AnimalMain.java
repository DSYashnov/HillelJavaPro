package hw_05.animals;

public class AnimalMain {
    public static void main(String[] args) {
        Animal an = new Animal("Animal");
        an.run(151);
        Cat cat = new Cat("Jora");
        cat.run(150);
        cat.swim(100);
        Dog dog = new Dog("Dick");
        dog.run(499);
        dog.swim(11);
    }
}
