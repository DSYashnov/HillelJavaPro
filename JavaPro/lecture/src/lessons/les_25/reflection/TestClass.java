package lessons.les_25.reflection;

public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        Class fooRefl = Class.forName("lessons.les_25.reflection.Test");
        System.out.println(fooRefl.getName());

        Test ex = (Test) fooRefl.newInstance();

        System.out.println(ex);
    }
}
