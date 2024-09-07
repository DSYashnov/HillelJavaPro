package hw_06;

public class Subscriber {
    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private String phoneNumber;
    private String contactNumber;
    private double balance;
    private double callDuration;
    private double interCityCallDuration;
    private double internetTraffic;

    public Subscriber(int id, String firstName, String lastName, String city, String phoneNumber, String contactNumber,
                      double balance, double callDuration, double interCityCallDuration, double internetTraffic) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contactNumber = contactNumber;
        this.balance = balance;
        this.callDuration = callDuration;
        this.interCityCallDuration = interCityCallDuration;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(double callDuration) {
        this.callDuration = callDuration;
    }

    public double getInterCityCallDuration() {
        return interCityCallDuration;
    }

    public void setInterCityCallDuration(double interCityCallDuration) {
        this.interCityCallDuration = interCityCallDuration;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", balance=" + balance +
                ", callDuration=" + callDuration +
                ", interCityCallDuration=" + interCityCallDuration +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}
