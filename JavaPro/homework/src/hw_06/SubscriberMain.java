package hw_06;

public class SubscriberMain {
    public static void main(String[] args) {
        Subscriber[] subscribers = new Subscriber[] {
                new Subscriber(1, "Ivan", "Ivanov", "Dnipro", "213124141", "31534645", 50.0, 120, 50, 5.5),
                new Subscriber(2, "Petrov", "Petr", "Lviv", "0987654321", "CN124", -10.0, 60, 0, 2.0),
                new Subscriber(3, "Sidorov", "Sidr", "Kyiv", "1122334455", "CN125", 100.0, 200, 100, 10.0),
                new Subscriber(4, "Kovalenko", "Olena", "Odesa", "5544332211", "CN126", 20.0, 180, 50, 7.5)
        };

        SubscriberService service = new SubscriberServiceImpl();
        //створення сервісу
        Subscriber[] cityCallSubscribers = service.getSubscriberWithCityCallDurationAbove(100, subscribers);
        System.out.println("Subscriber with call city duration above 100 minutes:");
        for (Subscriber s : cityCallSubscribers) {
            System.out.println(s);
        }
        //
        Subscriber[] interCityCallSubscribers = service.getSubscriberWithInterCityCalls(subscribers);
        System.out.println("\nSubscribers with inter-city calls:");
        for (Subscriber s : interCityCallSubscribers){
            System.out.println(s);
        }
        Subscriber[] initialSubscribers = service.getSubscribersByLastNameInitial('I', subscribers);
        System.out.println("\nSubscribers with last name initial 'I':");
        for (Subscriber s :initialSubscribers){
            System.out.println(s.getFirstName() + s.getLastName()+ ", phone: " + s.getPhoneNumber() + ", Balance: " + s.getBalance());
        }
        double totalTraffic = service.getTotalInternetTrafficForCity("Dnipro", subscribers);
        System.out.println("\nTotal internet traffic for Dnipro: " + totalTraffic + "GB");

        int negativeBalanceCount = service.getCountOfSubscribersWithNegativeBalance(subscribers);
        System.out.println("\nCount of subscribers with negative balance: " + negativeBalanceCount);
    }
}
