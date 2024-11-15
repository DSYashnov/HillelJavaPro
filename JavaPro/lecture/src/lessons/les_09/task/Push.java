package lessons.les_09.task;

import java.util.Scanner;

public class Push {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value try:");
        if(s.hasNextInt()) {
            int approach = s.nextInt();
            int approachTime = 0;
            int breaks = 0;
            int breakIncrease = 60;
            int i = 0;

            while (i < approach) {
                breakIncrease = (i != 0) ? (int) (breakIncrease * 1.2) : breakIncrease;
                i++;
                approachTime += i * 5;
                breaks += (i < approach) ? breakIncrease : 0;
            }
            int time = breaks + approachTime;
            int hours = time / 3600,
                min = time / 60 % 60,
                sec = time % 60;

            String result = (approach <= 0 || approach > 20) ? "Incorrect enter" : "Run time hh:mm:ss - " + String.format("%02d:%02d:%02d", hours, min, sec);
            System.out.println(result);
        } else System.out.println("Incorrect enter");
    }
}
