import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnEx {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //create connection to DB
        Class.forName("com.mysql.cj.jdbc.Driver"); //driver registration
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hillel?"
        + "useSSL=false&user=root&password=rootroot&serverTimezone=UTC");

        //get metadata from table
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from company");
        System.out.println("Table name : " + rs.getMetaData().getTableName(1));
        System.out.println("------------------");
        int columnCount = rs.getMetaData().getColumnCount();
        for (int i = 1; i < columnCount; i++) {
            System.out.print("column name : " + rs.getMetaData().getColumnName(i) + ", ");
            System.out.print("column size : " + rs.getMetaData().getColumnDisplaySize(i) + ", ");
            System.out.println("column type : " + rs.getMetaData().getColumnTypeName(i) + ", ");
        }
//
//        //add students to db
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into student(first_name, last_name) values (?,?)");
//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student("Ivan", "Ivanov"));
//        students.add(new Student("Petr", "Petrov"));
//        students.add(new Student("Sidr", "Sidorov"));
//
//        for (Student s : students) {
//            preparedStatement.setString(1, s.getFirstName());
//            preparedStatement.setString(2, getLastName());
//            preparedStatement.executeUpdate();
//        }

//
//        Statement statement = connection.createStatement();
//        ResultSet rs = statement.executeQuery("select  * from student");
//
//        List<Student> employees = new ArrayList<>():
//        while (rs.next()) {
//            int id rs.getInt (1);
//            String firstName = rs.getString(2);
//            String lastName = rs.getString(3);
//
//            employees.add(new Student().setId(id).setFirstName(firstName).setLastName(lastName));
//        }
//
//        employees.forEach(System.out::println);
//        connection.close();
    }
}
