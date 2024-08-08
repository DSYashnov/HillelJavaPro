package hw_05.Animals;

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run (int range){
        System.out.println( name + " пробіг " + range + "м");
    }
}
