package lessons.les_06.thisVSsuper;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1);
        System.out.println("-------------------");
        Parent p2 = new Parent("Stas", "Yashnov");
        System.out.println(p2);
        System.out.println("-------------------");
        Child ch1 = new Child(12);
        System.out.println(ch1);
        System.out.println("-------------------");
        Child ch2 = new Child("Stas", "Yashnov", "Stas", "Yashnov");
        System.out.println(ch2);
        System.out.println("-------------------");
        Child ch3 = new Child("Stas", "Yashnov");
        System.out.println(ch3);
    }
}
