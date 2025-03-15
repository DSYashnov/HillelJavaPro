package lessons.les_14.streams;

import lessons.les_14.Sex;
import lessons.les_14.User;
import lessons.les_14.UserService;

import java.util.Comparator;
import java.util.List;

public class ExMap {
    public static void main(String[] args) {
        List<User> users = UserService.getUserList();
        users.forEach(User::print);

//        users.stream()
//                        .sorted(Comparator.comparing(User::getAge)).forEach(System.out::println);
//

        System.out.println("---------");
        List<String> userFullName = users.stream()
                .filter(u -> u.getSex().equals(Sex.MALE))
                .peek(u -> u.setFullName(u.getFirstName() + " " + u.getLastName()))
                .sorted(Comparator.comparing(User::getAge))
                .map(User::getFullName)
                .toList();

        userFullName.forEach(System.out::println);
    }
}
