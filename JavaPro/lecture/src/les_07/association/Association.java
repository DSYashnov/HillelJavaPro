package les_07.association;

public class Association {
    public static void main(String[] args) {

    }
}
class Car {
    private Radio radio;

    public Car(){
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
