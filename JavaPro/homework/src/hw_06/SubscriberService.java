package hw_06;

public interface SubscriberService {
    Subscriber[] getSubscriberWithCityCallDurationAbove (int minutes, Subscriber[] subscribers);
    Subscriber[] getSubscriberWithInterCityCalls (Subscriber[] subscribers);
    Subscriber[] getSubscribersByLastNameInitial (char initial, Subscriber[] subscribers);
    double getTotalInternetTrafficForCity (String city, Subscriber[] subscribers);
    int getCountOfSubscribersWithNegativeBalance (Subscriber[] subscribers);
}
