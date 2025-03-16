package lessons.les_14.streams;

import lessons.les_14.Sex;
import lessons.les_14.User;
import lessons.les_14.UserService;

import java.util.List;

public class MapPeekStream {
    public static void main(String[] args) {
        List<User> users = UserService.getUserList();

        List<User> userList = users.stream()
                .filter(u -> u.getSex().equals(Sex.MALE))
                .peek(u -> {u.setId(1);}).toList();

        users.forEach(User::print);
    }
}
