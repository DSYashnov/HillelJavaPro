package lessons.les_05.exercises3;

public class Exercises3 {

    public static  void show(){
        System.out.println("static method called");
    }

    public static void main(String[] args) {
    Exercises3.show();

    Exercises3 obj = null;
    obj.show();

    show();

    Exercises3 e = new Exercises3();
    e.show();
    }
}
