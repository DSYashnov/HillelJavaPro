package lessons.les_12.task;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int total = 0;
        for (int i = 0; i < 20;) {
            if(isArmstrongNumber(total++)) {
                System.out.println(total);
                i++;
            }
        }

        Integer number = 8208;
        System.out.println(isArmstrongNumber(number));
    }
    public static boolean isArmstrongNumber (Integer number) {
        String[] split = String.valueOf(number).split("");
        int pow = split.length;
        int result = 0;

        for (String s : split) {
            Integer i = Integer.valueOf(s);

            result += (int) Math.pow(i, pow);
        }
        return result == number;
    }
}
