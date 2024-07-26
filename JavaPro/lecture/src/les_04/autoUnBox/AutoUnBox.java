package les_04.autoUnBox;

public class AutoUnBox {
    public static void main(String[] args) {
        int a = 10;
        Integer aI = 0;

        System.out.println(aI); //autoBoxing

        int iP = aI; // unBoxing

        System.out.println(iP);

        long l = aI;

        System.out.println(l);
    }
}
