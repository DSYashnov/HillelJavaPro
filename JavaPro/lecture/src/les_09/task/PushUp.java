package les_09.task;

public class PushUp {
    public static void main(String[] args) throws InterruptedException {

        int attempt = 4;

        int pushUpTime = 5;
        int restTime = 60;
        double restTimeCoef = 1.2;

        int totalTime = 0;
        int totalPushUp = 0;

        for (int i = 1; i <= attempt; i++) {
            System.out.println("attempt # " + i);
            for (int j = 0; j < i; j++) {
                totalTime += pushUpTime;
                totalPushUp++;
                System.out.print("#");
            }
            if (i < attempt) {
                totalTime += restTime;
                restTime = (int) (restTime * restTimeCoef);
            }
            System.out.println();
        }

        System.out.println(totalTime);
        System.out.println(totalPushUp);

        System.out.println("totalTime -> " + totalTime / 60 + " min " + totalTime % 60 + " s");

    }
}
