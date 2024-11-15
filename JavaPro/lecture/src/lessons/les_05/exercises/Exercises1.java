package lessons.les_05.exercises;

public class Exercises1 {
    static int a = 1111;

    static {
        System.out.println("static");
        a = a-- - --a;
    }
    {
        System.out.println("non static");
        a = a++ + ++a;
    }

    public static void main(String[] args) {
        System.out.println(a);
        Exercises1 exercises1 = new Exercises1();
        System.out.println(a);
    }

}
