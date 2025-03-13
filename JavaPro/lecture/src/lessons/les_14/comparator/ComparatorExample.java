package lessons.les_14.comparator;



import lessons.les_14.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Stanislav"));
        userList.add(new User("Sveta"));
        userList.add(new User("Anna", "3", 34));
        userList.add(new User("Anna", "3", 12));
        userList.add(new User("Alex", "3", 12));
        userList.add(new User("Alex", "2", 43));
        userList.add(new User("Alex", "1", 34));
        userList.add(new User("Petr", "1", 44));

        Comparator<User> userComparator = Comparator.comparing(User::getFirstName);
        Comparator<User> phoneComparator = Comparator.comparing(User::getAge);

        userList.forEach(System.out::println);
        System.out.println("---------");
        System.out.println();
        userList.sort(userComparator
                .thenComparing(User::getFirstName)
                .thenComparing(phoneComparator));
        userList.forEach(System.out::println);
    }
}
