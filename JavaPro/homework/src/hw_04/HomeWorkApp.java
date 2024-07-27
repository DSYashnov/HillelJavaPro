package hw_04;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-21, -1);
        printColor(-1);
        compareNumbers(1, 3);
        trueOrFalse(5, 1);
    }
    //task 02
    public static void printThreeWords(){
        System.out.println("Orange\n\nBanana\n\nApple");
    }

    //task 03
    public static boolean checkSumSign(int a, int b){
        int result = a + b;
        boolean bol = true;
        if (result >= 0){
            System.out.println(bol);
            System.out.println("Сума позитивна");
        } else {
            System.out.println(!bol);
            System.out.println("Сума негативна");
        }
        return bol;
    }
    //task 04
    public static void printColor(int value) {
        if (value <= 0){
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }
    //task 05
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println(" a < b");
        }
    }
    //task 06
    public static boolean trueOrFalse(int a, int b){
        int result = a + b;
        boolean bool = true;
        if (result >= 10 && result <= 20){
            System.out.println(bool);
        } else {
            System.out.println(!bool);
        }
        return bool;
    }
    //task 07


}
