package handwritten;

public class Main {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longest(s));
    }

    public static String longest(String s) {
        if (s.isEmpty()) return s;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int left = 0;
        int right = 0;
        for (int i = n - 2; i >= 0; i--) {
            dp[i][i] = true;
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && ((j - i < 3) || dp[i + 1][j - 1]);
                if (dp[i][j] && right - left < j - i) {
                    left = i;
                    right = j;
                }
            }
        }
        return s.substring(left, right + 1);

    }

}
