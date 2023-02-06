public class Palindrome {
    public static boolean isPalindrome(String s) {

        if (s == null) {
            return false;
        }
        s = s.toLowerCase();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}