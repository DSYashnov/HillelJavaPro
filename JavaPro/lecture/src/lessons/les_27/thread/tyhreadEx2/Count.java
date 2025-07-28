package lessons.les_27.thread.tyhreadEx2;

import jdk.dynalink.beans.StaticClass;

public class Count {
    private static int count = 0;

    public static void increment () {
        count++;
    }
    public static int getCount() {
        return count;
    }
}
