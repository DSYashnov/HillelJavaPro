package lessons.les_06.interfaces;

public class Rus implements Say{
    @Override
    public void sayHello() {
        System.out.println("Привет....");
    }

    @Override
    public void sayGoodBuy() {
        System.out.println("Пока....");
    }
}
