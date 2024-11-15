package lessons.les_02;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());

        str = "     Hello World     ";
        System.out.println(str.length());

        str = str.trim();
        System.out.println(str.length());

        System.out.println("-----------");

        String str2 = "a\nb";
        System.out.println(str2);
        System.out.println(str2.length()); //4
        str2 = " ";
        System.out.println(str2.isBlank()); //false
        str2 = " ";
        System.out.println(str2.isEmpty()); //false

        str = "one";
        str2 = "two";

        str = str.concat(str2).concat(str2);
        System.out.println(str);

        str = String.valueOf(100);
        System.out.println(str);

        str = String.join("<->", str2, str, str2, "_");
        System.out.println(str);

        str = "one";
        str2 = "onE";
        String str3 = "two";

        System.out.println(str.compareTo(str2));
        System.out.println(str.compareTo(str3));

        System.out.println(str.equals(str2)); //false
        System.out.println(str.equalsIgnoreCase(str2)); //true

        System.out.println(str2.charAt(2));

        System.out.println(str.indexOf('d'));
        System.out.println(str2.indexOf('e'));
        System.out.println(str2.lastIndexOf('d'));
        System.out.println(str2.lastIndexOf('e'));


        String fileName = "pic.jpg";
        System.out.println(fileName.endsWith(".jpg"));
        System.out.println(fileName.startsWith(".jpg"));

        fileName = fileName.replaceFirst("p", "P");
        System.out.println(fileName);


        str = "   _   _   ";
        System.out.println(str.length());
        System.out.println(str.trim().length());
        System.out.print(str);
        System.out.println("|");
        System.out.print(str.trim());
        System.out.println("|");

        System.out.println("Hello World".toLowerCase());
        System.out.println("Hello World".toUpperCase());


    }
}
