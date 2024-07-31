package hw_05.task_01;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Stanislav", "Yashnov", "Oleksandrovich", "IT", "s.yashnov@gmail.com", "+380634939107", 29);
        System.out.println(employee);
        employee.setAge(30);
        System.out.println(employee);
        System.out.println(employee.getAge());

    }
}
