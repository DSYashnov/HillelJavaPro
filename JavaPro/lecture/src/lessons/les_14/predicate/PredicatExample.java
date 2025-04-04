package lessons.les_14.predicate;



import lessons.les_14.User;
import lessons.les_14.Sex;

import java.util.function.Predicate;

public class PredicatExample {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setFirstName("Stanislav");
        user.setLastName("Yashnov");
        user.setAge(30);
        user.setSex(Sex.MALE);

        Predicate<User> isAdult = (u) -> u.getAge() > 18;
        Predicate<User> isChild = (u) -> u.getAge() <= 18;
        Predicate<User> isMale = (u) -> u.getSex().equals(Sex.MALE);
        Predicate<User> isFemale = (u) -> u.getSex().equals(Sex.FEMALE);

        System.out.println(isAdult.test(user));
        System.out.println(isAdult.and(isFemale).or(isChild).test(user));
        System.out.println(userNameIvanov().test(user));
    }

    static Predicate<User> userNameIvanov(){
        return user -> user.getLastName().equals("Ivanov");
    }
}
