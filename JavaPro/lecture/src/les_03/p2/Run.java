package les_03.p2;

import les_03.p1.A;

public class Run {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();

        a.m4(); //public

        c.m2(); //default
        c.m3(); //protected
        c.m4(); //public
    }
}
