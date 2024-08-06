package les_05.task;

public class Task1 {
    public static void main(String[] args) {
        int[] mass = {1, 25, 123, 12345};

        for (int i : mass){
            System.out.println(i);
            if (i < 10){
                continue;
            }
            String[] split = String.valueOf(i).split("");
            for (int j = 1; j < split.length; j++) {
                if(Integer.parseInt(split[j]) - Integer.parseInt(split[j-1]) == 1){
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
