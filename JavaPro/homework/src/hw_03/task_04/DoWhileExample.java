package hw_03.task_04;

public class DoWhileExample {
    public static void main(String[] args) {

        int d = 0;
        do {
            d++;
            if (d % 2 != 0) {
                System.out.print(d);
            }
        } while (d < 100);

        System.out.println();
        System.out.println("-------------");
        System.out.println(factorial(10));
    }

        public static String factorial (int n) {
            int j = 1;
            int fact = 1;
            do {
                ++j;
                fact *= j;
            } while (j < n);
            String s = "factorial number " + n + " = " + fact;
            return s;
        }
    }




