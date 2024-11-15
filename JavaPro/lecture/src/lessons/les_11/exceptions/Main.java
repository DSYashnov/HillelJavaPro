package lessons.les_11.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            new UserValidator().validate(new
                    User(
                            "Stanislav",
                    "St@gmail.com",
                    18,
                    "+380634939107")
            );
        } catch (AgeException | EmailException | PhoneException ex) {
            System.out.println(ex.getMessage());
        }
//        try {
//            new UserValidator().valid(new
//                    User("Stas", "St.gmail.com", 8, "+85456484546"));
//        } catch (RuntimeException ex) {
//            System.out.println(ex.getMessage());
//        }
//        new UserValidator().validate(new
//                User("Stasislav", "S@gmail.com", 2, "380634939107"));

//        new UserValidator().valid(new
//                User("Stas", "Stasgmail.com",2, "380634939107"));
//
//        String s = new String();
    }
}
