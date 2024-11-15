package lessons.les_06.abstr;

public class Teacher extends Human {
    private int salary;
    public int getSalary () {
        return  salary;
    }
    public void setSalary (int salary){
        this.salary = salary;
    }
    @Override
    void print(){

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", salary=" + salary +
                '}';
    }
}
