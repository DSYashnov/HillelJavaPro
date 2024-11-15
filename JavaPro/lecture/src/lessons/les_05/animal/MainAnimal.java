package lessons.les_05.animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Dog dog = new Dog();
        dog.voice();

        ((Animal) dog). voice();

        Cat cat = new Cat("1");
        cat.voice();
        cat.setAge("4");
        cat.setName("Barsik");
    }
}
