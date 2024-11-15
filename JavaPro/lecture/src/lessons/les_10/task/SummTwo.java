package les_10.task;

public class SummTwo {
    public static void main(String[] args) {
        int target = 9;
        Integer[] res = {1, 2, 3, 4, 4, 5};
        for (int i = 0; i < res.length; i++) {
            for (int j = 1; j < res.length; j++) {
                if (res[i] + res[j] == target) {
                    System.out.println("["+i + ", " + j + "]");
                    return;
                }
            }
        }
    }
}
