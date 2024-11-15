package lessons.les_07.hashcode;

import java.util.Objects;

public class HashCode {
    public static void main(String[] args) {
        User u1 = new User(1, 2, 3);
        User u2 = new User(1, 2, 4);
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());

        System.out.println(u1.hashCode() == u2.hashCode());
        System.out.println(u1 == u2);

        System.out.println(u1.equals(u2));
    }

}
class User {
    private int a;
    private int b;
    private int c;

    public User(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return a == user.a && b == user.b && c == user.c;
    }

    public boolean equalsUser (User u) {
        if (this == u) return true;
        if (u == null) return false;
        return a == u.a && b == u.b && c == u.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}