package lessons.les_14.streams;

import lessons.les_14.User;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
//        User user = new User();
//        user.setAge(12);
        User user = null;
        System.out.println("---1---");
        User opt1 = Optional.ofNullable(user).orElse(new User());
        System.out.println(user);
        System.out.println(opt1);

        System.out.println("---2---");
        User opt2 = Optional.ofNullable(user).orElseGet(A::print);
        System.out.println("---3---");
        User opt3 = Optional.ofNullable(user).orElseThrow(() -> new RuntimeException());

//        Optional<User> oUser = Optional.of(user);
//
//        if(opt.isPresent()) {
//            System.out.println(opt.map(o -> {
//                o.setAge(16);
//                o.setFirstName("name");
//                return o;
//            }));
//        }
        }

    public static User print() {
        System.out.println("test message");
        return new User();
    }
}
class A {
    public static User print(){
        System.out.println("test message from class A");
        return new User();
    }
}
