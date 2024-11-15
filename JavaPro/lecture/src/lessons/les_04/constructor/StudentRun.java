package lessons.les_04.constructor;

public class StudentRun {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st);
        st.setFirstName("Stanislav");
        st.setLastName("Yashnov");
        st.setAge(29);
        System.out.println(st);

        Student stud = new Student("Stas", "Yashnov");
        System.out.println(stud);
    }
}
