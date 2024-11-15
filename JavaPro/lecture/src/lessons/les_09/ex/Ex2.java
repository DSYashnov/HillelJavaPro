package lessons.les_09.ex;

public class Ex2 {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);


        if ("Hello".equals(s)) System.out.println(1);
        if (t == s) System.out.println(2);
        if (t.equals(s)) System.out.println(3);
        if ("Hello" == s) System.out.println(4);
        if ("Hello" == t) System.out.println(5);
    }
}
