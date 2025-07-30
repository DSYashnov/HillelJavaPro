package lessons.les_27.thread.tyhreadEx1;

public class JoinMet {
    public static void main(String[] args) {
        Thread thread = new ThreatTh("join-1");
        Thread thread1 = new ThreatJoin("join-2");
        thread.start();
        thread1.start();

        for (int i = 0; i < 30; i++) {
            try{
                Thread.sleep(250);
                System.out.println("run main thread : iteration >> " + i);
                if(i == 5){
                    thread.join();
                }
                if(i == 6){
                    thread1.join();
                }
            } catch (InterruptedException e) {
                System.out.println("catch interrupted exception");
            }
        }
    }
}
