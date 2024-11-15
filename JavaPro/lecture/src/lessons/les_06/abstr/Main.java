package lessons.les_06.abstr;

public class Main {
    public static void main(String[] args) {
        Human h = new Human() {
            @Override
            void print() {
                System.out.println("human");
            }
        };
        h.print();
        System.out.println("-----------------");

        Student student = new Student();
        student.setName("Stanislav");
        student.setAge(18);
        student.setGroup(2);

        Teacher teacher = new Teacher();
        teacher.setName("Stanislav");
        teacher.setSalary(100000);
        teacher.setAge(45);

        System.out.println(student);
        System.out.println(teacher);

        Human h2 = new Teacher();
    }
}
