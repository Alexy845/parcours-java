public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {
        if (subString == null || s == null) {
            return false;
        }
        if (subString.length() > s.length()) {
            return false;
        }
        for (int i = 0; i < s.length() - subString.length() + 1; i++) {
            if (s.substring(i, i + subString.length()).equals(subString)) {
                return true;
            }
        }
        return false;
    }
}