package les_03.whileExample;

public class WhileExample {
    public static void main(String[] args) {
        whileExample();
        System.out.println("------------");
        doWhileExample();
    }
    static void whileExample() {
        byte a = 5;
        byte res = 0;
        a = print(a);
        while (a < 10) { //false then nothing
            a = print(a);
        }
    }

    static void doWhileExample() {
        byte a = 10;
        byte res = 0;
        do {
            System.out.print(a++ + " ");
        } while (a < 100);
    }
     static byte print (byte b) {
         System.out.println(b++);
         return b;
     }
}
