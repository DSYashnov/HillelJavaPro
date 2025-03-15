package lessons.les_14.streams;



import lessons.les_14.Sex;
import lessons.les_14.User;
import lessons.les_14.UserService;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExFilter {
    public static void main(String[] args) {
        List<User> users = UserService.getUserList();
        users.forEach(User::print);
        System.out.println("-----------");

        Long f = users.stream().filter(u->u.getSex().equals(Sex.FEMALE)).count();
        Long m = users.stream().filter(u->u.getSex().equals(Sex.MALE)).count();

        System.out.println("f : " + f);
        System.out.println("m: " + m);
        System.out.println("total: " + (m+f));

        List<User> fUsers = users.stream().filter(u -> u.getSex().equals(Sex.FEMALE)).toList();
        System.out.println("----------");
        fUsers.forEach(User::print);


        Predicate<User> isMale = (u) -> u.getSex().equals(Sex.MALE);
        Predicate<User> isAdult = (u) -> u.getAge() > 18;

        System.out.println("---------");
        List<User> mUser = users.stream().filter(isMale.and(isAdult)).collect(Collectors.toList());
        mUser.forEach(User::print);

    }
}
