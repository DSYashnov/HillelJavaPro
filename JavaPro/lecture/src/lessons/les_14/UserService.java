package lessons.les_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService {
    public static List<User> getUserList (){
        return new ArrayList<>(Arrays.asList(
                new User(1, "Stanislav", "Yashnov", 30, Sex.MALE),
                new User(2, "Oleh", "Mukha", 11, Sex.MALE),
                new User(3, "Daniil", "Smolov", 15, Sex.MALE),
                new User(4, "Denis", "Gusta", 25, Sex.MALE),
                new User(5, "Max", "Chehov", 14, Sex.MALE),
                new User(6, "Olena", "Sidirov", 18, Sex.FEMALE),
                new User(7, "Inga", "Parmentier", 36, Sex.FEMALE),
                new User(8, "Antonio", "Djokovic", 23, Sex.MALE),
                new User(9, "Alexandro", "Svitolina", 5, Sex.MALE),
                new User(10, "John", "Berrettini", 11, Sex.MALE),
                new User(11, "Petr", "Tansim", 17, Sex.MALE),
                new User(12, "Anna", "Lowery", 16, Sex.FEMALE),
                new User(13, "Oksana", "Kairo", 18, Sex.FEMALE),
                new User(14, "Inna", "Richardson", 29, Sex.FEMALE)
        ));
    }
    public static ArrayList<Optional> getOtpUserList(){
        return new ArrayList<>(Arrays.asList(
                Optional.ofNullable(new User(1, "Stanislav", "Yashnov", 30, Sex.MALE)),
                Optional.ofNullable(new User(2, "Oleh", "Mukha", 11, Sex.MALE)),
                Optional.ofNullable(null),
                Optional.ofNullable(new User(12, "Anna", "Lowery", 16, Sex.FEMALE))
        ));
    }

}
