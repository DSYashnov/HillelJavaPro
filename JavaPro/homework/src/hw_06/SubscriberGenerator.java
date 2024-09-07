package hw_06;

public class SubscriberGenerator {
    public static Subscriber[] generatorSubArray(){
        Subscriber[] arr = new Subscriber[3];
        arr[0] = new Subscriber(1, "User", "Adm", "Dnipro", "3716378126387",
                "83729837298", 5000, 323, 123, 2434);
        arr[1] = new Subscriber(2, "Alice", "Smith", "Kyiv", "1234567890123",
                "0987654321", 4500, 456, 789, 1200);

        arr[2] = new Subscriber(3, "Bob", "Johnson", "Lviv", "9876543210987",
                "0123456789", 6000, 789, 456, 3400);
        return arr;
    }
}
