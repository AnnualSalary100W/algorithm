package leetcode;

public class IsLongPressedName {
    public static void main(String[] args) {
        String s1 =  "kikcxmvzi";
        String s2 =  "kiikcxxmmvvzz";
        System.out.println(isLongPressedName(s1,s2));
    }
    private static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
