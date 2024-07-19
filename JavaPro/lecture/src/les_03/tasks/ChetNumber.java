package les_03.tasks;

public class ChetNumber {
    public static void main(String[] args) {
        int number = 1_111_111_111;
        System.out.println(calculate(12235));
    }
    private static int calculate (int value){
        int res = 0;
        while (value > 0){
            int tmp = value % 10;
            if (tmp % 2 != 0)
                res += tmp;
                value = value / 10;
        }
        return res;
    }
}
