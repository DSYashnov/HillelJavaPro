package hw_06;

public class SubscriberServiceImpl implements SubscriberService{
    @Override
    public Subscriber[] getSubscriberWithCityCallDurationAbove(int minutes, Subscriber[] subscribers) {
        //пшдрахунок кількостіабонентів, що задовольняють умову
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCallDuration() > minutes) {
                count++;
            }
        }
        // массив для збереження результату
        Subscriber [] result = new Subscriber[count];
        int index = 0;
        // заповненя масиву резульататів
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCallDuration() > minutes) {
                result[index++] = subscriber;
            }
        }
        return result;
    }

    @Override
    public Subscriber[] getSubscriberWithInterCityCalls(Subscriber[] subscribers) {
        // кількість абонентів, що здійснювали міжміські дзвінки
        int count  = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getInterCityCallDuration() > 0) {
                count++;
            }
        }
        // массив для збереження резуьтату
        Subscriber[] result = new Subscriber[count];
        int index = 0;

        // заповнюємо масив результатів
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getInterCityCallDuration() > 0){
                result[index++] = subscriber;
            }
        }
        return result;
    }

    @Override
    public Subscriber[] getSubscribersByLastNameInitial(char initial, Subscriber[] subscribers) {
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLastName().charAt(0) == initial){
                count++;
            }
        }
        Subscriber[] result = new Subscriber[count];
        int index = 0;

        //заповнюємо масив результатів
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLastName().charAt(0) == initial) {
                result[index++] = subscriber;
            }
        }
        return result;
    }

    @Override
    public double getTotalInternetTrafficForCity(String city, Subscriber[] subscribers) {
        double totalTraffic = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCity().equalsIgnoreCase(city)) {
                totalTraffic += subscriber.getInternetTraffic();
            }
        }
        return totalTraffic;
    }

    @Override
    public int getCountOfSubscribersWithNegativeBalance(Subscriber[] subscribers) {
        int count = 0;

        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                count++;
            }
        }
        return count;
    }
}
