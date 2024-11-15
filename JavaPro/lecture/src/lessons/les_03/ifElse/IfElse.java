package lessons.les_03.ifElse;

public class IfElse {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;

        /*
        if() {
        }
        else {
        }




         */

        if (compare(a, b)) {
            // a < b
            System.out.println("True");
        } else if (a == b) {
            // a = b
            System.out.println("==");
        } else {
            // b > a
            System.out.println("False");
        }


        boolean res = (a > b) ? true : false; //condition ? true : false
        System.out.println(true ? print1() : print2());

        System.out.println(res);
    }

    static boolean compare (int a, int b) {
        return a < b;
    }

    static String print1 (){
        System.out.println("Print1");
        return "1";
    }
    static String print2(){
        System.out.println("Print2");
        return "2";
    }
}
