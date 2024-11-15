package lessons.les_06.interfaces;

public class MainLang {
    public static void main(String[] args) {
        Say say;

        if (args.length != 0 && args[0].equals("rus")){
            say = new Rus();
        }else{
            say = new Engl();
        }
        say.sayHello();
        say.sayGoodBuy();
        Say.hello();
    }
}
