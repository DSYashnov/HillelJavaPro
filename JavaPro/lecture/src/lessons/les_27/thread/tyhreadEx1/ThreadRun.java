package lessons.les_27.thread.tyhreadEx1;

import static java.lang.Thread.sleep;

public class ThreadRun implements Runnable {
    @Override
    public void run () {
        for (int i = 0; i < 20; i++) {
            try {
                sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "Runnable >> value >> " + i);
        }
    }
}
