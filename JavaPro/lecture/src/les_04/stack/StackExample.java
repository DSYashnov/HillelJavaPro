package les_04.stack;

public class StackExample {
    public static void main(String[] args) {
        int k = 0; // 1 (k) - 1

        for (int i = 0; i < 5; i++) { // 2 (i) - 2
            fr(i);
            k = i;
            for (int j = 0; j < 5; j++) { // 3 (j) - 3
                sec(j);
                k = j;
            } // 3 drop 2
        } // 2 drop 1

        int i = 5; //2

        //stack 1 (k)
        if (false){
            int d = 0; // 3(d)
        } else {
            int d = 0; //3 (d)
        } // drop - 2

        int s = 9; // 3 (s)

        // s drop
        // k drop
    } // finish
    private static void fr (int i) {
        System.out.println(i);
    }
    private static void sec (int j) { // new var
        System.out.println(j);
    }
}
