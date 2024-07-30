package hw_05.task_03;

public class Car {
    public void start(){
        startCommand();
        startElectricity();
        startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("start electricity");
    }
    private void startCommand(){
        System.out.println("start command");
    }
    private void startFuelSystem(){
        System.out.println("start fuel system");
    }
}
