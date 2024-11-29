package lessons.les_13;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        System.out.println(remove("aaabbbccc"));

    }
    private static String remove (String string) {
        for (int i = string.length()-1; i >= 0; i--) {
            if(string.indexOf(string.charAt(i)) != i){
                string = string.substring(0, i).concat(string.substring(i + 1));
            }
        }
        return string;
    }
}
