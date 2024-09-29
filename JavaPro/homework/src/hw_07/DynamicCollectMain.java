package hw_07;

public class DynamicCollectMain {
    public static void main(String[] args) {
        DynamicCollect dynamicCollect = new DynamicCollect();

        // add new array
        dynamicCollect.add("Hello");
        dynamicCollect.add("World");
        dynamicCollect.add(1, "Java");
        dynamicCollect.print();


        dynamicCollect.delete("World");
        dynamicCollect.print();

        System.out.println(dynamicCollect.get(0));
    }
}
