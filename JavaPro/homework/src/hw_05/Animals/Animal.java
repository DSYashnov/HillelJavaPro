package hw_05.Animals;

public class Animal {
    private static int count =0;
    private String name;

    public Animal(String name) {
        this.name = name;
        count++;
        System.out.println("Створено тварин - " + count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run (int range){
        System.out.println( name + " пробіг " + range + "м");
    }
    public void swim(int range){
        System.out.println(name + " проплив " + range + "м");
    }
}
