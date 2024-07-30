package hw_05.task_01;

public class Employee {
    private String firstName;
    private String lastName;
    private String surname;
    private String position;
    private String mail;
    private String phone;
    private int age;

    public Employee(String firstName, String lastName, String surname, String position, String mail, String phone, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
