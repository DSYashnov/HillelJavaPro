package lessons.les_04.constructor;

public class Predmet {
    private String name;
    private int hours;

    public Predmet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }
}
