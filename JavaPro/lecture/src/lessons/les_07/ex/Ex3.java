package lessons.les_07.ex;

public class Ex3 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println(foo.a);
        System.out.println(foo.b);
        System.out.println(foo.c);
        }
    }
    class Foo {
        int a = 5;
        protected int b = 6;
        public int c = 7;
    }

