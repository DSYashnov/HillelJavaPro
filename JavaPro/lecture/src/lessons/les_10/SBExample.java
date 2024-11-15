package lessons.les_10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SBExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        stringBuilder.append(simpleDateFormat.format(new Date())).append(">>>");

        if (args.length > 0 && args[0].equals("1")) {
            stringBuilder.append("1");
        } else {
            stringBuilder.append("2");
        }

        System.out.println(stringBuilder);

        System.out.printf("test %s text %s %n","aaa", "bbb");

        StringBuilder sb1 = stringBuilder;
        System.out.println(sb1);
        System.out.println(stringBuilder);

        sb1.append("ddddd");

        System.out.println(sb1);
        System.out.println(stringBuilder);
    }
}
