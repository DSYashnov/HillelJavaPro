package lessons.les_14.streams;

import lessons.les_14.Sex;
import lessons.les_14.User;
import lessons.les_14.UserService;

import java.util.List;

public class MapStream {
    public static void main(String[] args) {
        List<Integer> inst = List.of (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        inst.stream()
                .filter(i -> i % 2 == 0)
                .map(i-> i * i)
                .forEach(i -> System.out.print(i + " "));

        List<User> users = UserService.getUserList();

        List<User> userList = users.stream()
                .filter(u-> u.getSex().equals(Sex.MALE))
                .map(u -> {
                    User user = new User(u);
                    user.setLastName(user.getLastName() + "_male");
                    return user;
                }).toList();

        users.forEach(User::print);
        System.out.println("-----");
        userList.forEach(User::print);
    }


}
