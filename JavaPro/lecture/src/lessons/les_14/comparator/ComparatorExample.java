package lessons.les_14.comparator;

import lessons.les_11.lombok.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Stanislav", "1234646456", "12345646456"));
        userList.add(new User("Oleg", "548945", "31231"));
        userList.add(new User("Vasiliy", "12213134553456", "123456"));
        userList.add(new User("Denis", "4534231", "123456"));
        userList.add(new User("Serhii", "21312345", "712873456"));
        userList.add(new User("Olena", "1232316354656", "1234567886456"));
        userList.add(new User("Anastasiya", "14896456423456", "1234564565466"));

        Comparator<User> userComparator = Comparator.comparing(User::getName);
        Comparator<User> phoneComparator = Comparator.comparing(User::getPhone);

        userList.forEach(System.out::println);
        System.out.println("---------");
        System.out.println();
        userList.sort(userComparator
                .thenComparing(User::getName)
                .thenComparing(phoneComparator));
        userList.forEach(System.out::println);
    }
}
