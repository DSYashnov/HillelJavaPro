package hw_03.task_03;

public class WhileExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.println("------------");
        System.out.println(factorial(5));
    }
    public static int factorial (int n) {
        int j = 1;
        int fact = 1;
        while(j <= n){
            System.out.println(j + " step: " + j);
            fact *= j;
            ++j;
        }
        return fact;
    }
}
