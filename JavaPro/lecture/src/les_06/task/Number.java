package les_06.task;

public class Number {
    public static void main(String[] args) {
        String str = "123456789";

//        str.lastIndexOf();
//        str.indexOf();


        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            System.out.println(c);
//            System.out.println(str.indexOf(c));
//            System.out.println(str.lastIndexOf(c));
            if (str.indexOf(c) != str.lastIndexOf(c)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
