package les_04.constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor c = new Constructor();
        c.printParam();
        c.a = 10;
        c.b = 20;
        c.printParam();

        Constructor c1 = new Constructor(2, 3);
        Constructor c2 = new Constructor(2);

        c2.printParam();

    }
}
