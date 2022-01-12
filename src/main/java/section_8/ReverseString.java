package section_8;

public class ReverseString {
    public static void main(String[] args) {
        String s = "135311";
        boolean isPalindrome = checkPalindrome(s);
        System.out.format("'%s' is palindrome: '%s'", s, isPalindrome);
    }

    private static boolean checkPalindrome(String s) {
        String reverseStr = "";
        for (int i = s.length()-1; i >=0; i--) {
            reverseStr += s.charAt(i);
        }

        if (s.equals(reverseStr)) return true;

        return false;
    }
}
