package lessons.les_14;


import java.util.Optional;

public class OptionalConstr {
    public static void main(String[] args) {
        User us = new User();

        Optional<User> oUser = Optional.of(us);
        oUser.ifPresent(oUser.get()::printUser);

        oUser.ifPresent(us::printUser);
        Optional<User> user = Optional.ofNullable(us);

        Optional<User> userEmpty = Optional.empty();


    }

}
