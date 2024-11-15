package les_10.task;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome("111111"));
    }
    private static boolean isPalindrome(String string) {
        return new StringBuilder(string).reverse().toString().equals(string);
    }
}
