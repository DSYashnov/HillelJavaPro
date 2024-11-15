package lessons.les_06.abstr;

public class Student extends Human{
    private int group;

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    void print() {

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", group=" + group +
                '}';
    }
}
