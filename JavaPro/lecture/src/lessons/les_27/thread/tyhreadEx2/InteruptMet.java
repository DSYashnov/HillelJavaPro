package lessons.les_27.thread.tyhreadEx2;

public class InteruptMet {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thr();
        thread.start();

        while (true) {
            System.out.println(thread.isAlive());
            Thread.sleep(1300);
            int rez = Count.getCount();
            System.out.println(rez + " >> " + rez % 3);

            if (rez % 3 == 0) {
                thread.interrupt();
                break;
            }
        }
    }
}
