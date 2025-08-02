package lessons.les_27.thread.tyhreadEx2;

import javax.swing.plaf.ComponentUI;

public class Thr extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(233);
                Count.increment();
                System.out.println(Count.getCount());
            } catch (InterruptedException e) {
                System.out.println("program finish");
                break;
            }
        }
    }
}
