package les_07.agregation;

public class Agregation {
    public static void main(String[] args) {
        Radio radio = new Radio("102.2 - Feel");

        Car car = new Car(radio);

        System.out.println(car.getRadio().getName());

        radio.setName("102.2 - Feel");
        System.out.println(car.getRadio().getName());

        car.getRadio().setName("My radio");

        System.out.println(car.getRadio().getName());
    }
}
class Car {

    private Radio radio;

    public Car(Radio radio){
        this.radio = radio;
    }
    public Radio getRadio() {
        return radio;
    }
}

class Radio {
    private String name;

    public Radio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
