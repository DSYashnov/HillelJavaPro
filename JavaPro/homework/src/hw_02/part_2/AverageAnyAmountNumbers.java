package hw_02.part_2;

public class AverageAnyAmountNumbers {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Будь ласка введіть хоча б лжне число як аргумент");
            return;
        }
        double sum = 0;
        for(String arg : args){
            sum += Double.parseDouble(arg);
        }
        double average = sum / args.length;
        System.out.println("Середнє арифметичне значення: " + average);
    }

}
