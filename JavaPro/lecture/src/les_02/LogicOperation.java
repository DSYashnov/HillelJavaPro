package les_02;

public class LogicOperation {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 1;

        System.out.println(a < b);
        System.out.println(a < c);
        System.out.println(a <= b);
        System.out.println(a >= c);

        System.out.println("----------");

        System.out.println(a > b);
        System.out.println(a > c);
        System.out.println(a >= b);
        System.out.println(a >= c);

        System.out.println("----------");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a != b);
        System.out.println(a != c);

        System.out.println("----------");

        System.out.println(oFalse() && oTrue() && oFalse() && oTrue());
        System.out.println("----------");
        System.out.println(oFalse() & oTrue() & oFalse() & oTrue());
        System.out.println("----------");
        System.out.println(oFalse() || oFalse() || !oTrue() & a == b + 1 && true);
        System.out.println("----------");
        System.out.println(oTrue() | oFalse() | !oTrue());

    }
    private static boolean oTrue(){
        return true;
    }
    private static boolean oFalse(){
        return false;
    }
}
