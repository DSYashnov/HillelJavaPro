import dto.Student;
import mapper.DateMapper;
import service.DBService;
import service.impl.DBServiceImpl;
import validate.GroupNumberValidator;

import javax.xml.validation.Validator;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) throws SQLException, ParseException {
        DBService dbService = new DBServiceImpl();
        do {

            System.out.println("-------------- Student DB --------------");
            System.out.println("Please select action");
            System.out.println("0 - exit from application");
            System.out.println("1 - look list of groups");
            System.out.println("2 - look list of students by group");
            System.out.println("3 - insert student");
            System.out.println("4 - delete student");

            Scanner s = new Scanner(System.in);

            Integer action = s.nextInt();
            s.nextLine();
            switch (action) {
                case 0:
                    System.exit(-1);
                case 1:
                    dbService.getGroupList().forEach(System.out::println);
                    break;
                case 2:
                    String groupNumber = "";
                    do {
                        System.out.println("Please enter number group in format : GR-XX");
                        groupNumber = s.nextLine().toUpperCase();
                    } while (!GroupNumberValidator.validateNumber(groupNumber));
                    dbService.getGroupLisByGroup(groupNumber).forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Please enter first name");
                    String firstName = s.nextLine();
                    System.out.println("Please enter last name");
                    String lastName = s.nextLine();
                    System.out.println("Please enter date of births : YYY-MM-DD");
                    String dateOfBirths = s.nextLine();
                    System.out.println("Please enter email");
                    String email = s.nextLine();
                    System.out.println("Please enter number group in format : GR-XX");
                    groupNumber = s.nextLine().toUpperCase();
                    System.out.println("Please enter country");
                    String country = s.nextLine();
                    dbService.createStudent(new Student().setFirstName(firstName).setLastName(lastName).setDateOfBirths(DateMapper.convertDateFromString(dateOfBirths)).setGroup(groupNumber).setEmail(email).setCountry(country));
                    break;
                case 4:
                    System.out.println("Please enter password for check ability users");
                    String password = s.nextLine();
                    if (password.equals("root")){
                        System.out.println("Please enter student id for delete");
                        int id = s.nextInt();
                        dbService.deleteStudent(id);
                    }
                    break;
                default:
                    System.out.println("Incorrect enter. Please try again!!!");
            }
        } while (true);
    }
}
