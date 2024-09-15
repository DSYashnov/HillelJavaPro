package les_07.hashcode;

import java.util.Objects;

public class HashCode {


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