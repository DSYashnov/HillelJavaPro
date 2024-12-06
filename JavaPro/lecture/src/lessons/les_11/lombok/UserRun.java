package lessons.les_11.lombok;

import java.sql.SQLOutput;

public class UserRun {
    public static void main(String[] args) {
        User user = new User();

        user.setName("Stanislav");
        user.setEmail("email");
        user.setPhone("phone");

        System.out.println(user);

        System.out.println(User.builder()
                .name("Stanislav")
                .phone("olPhone")
                .email("s.yashnov@gmail.com")
                .build());
    }

}
