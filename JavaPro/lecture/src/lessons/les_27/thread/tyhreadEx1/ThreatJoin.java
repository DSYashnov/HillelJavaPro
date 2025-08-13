package lessons.les_27.thread.tyhreadEx1;

public class ThreatJoin extends Thread {
    public ThreatJoin (String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "THREAD >> value >> " + i);
        }
    }
}
