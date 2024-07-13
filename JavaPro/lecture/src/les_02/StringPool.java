package les_02;

public class StringPool {
    public static void main(String[] args) {
        String str1 = "cat"; //stringPool
        String str2 = "cat"; //stringPool
        String str3 = new String ("cat"); //heap



        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
}
