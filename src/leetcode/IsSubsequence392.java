package leetcode;

public class IsSubsequence392 {
    public static void main(String[] args) {
        String s="abc",t="ahbgdc";
        System.out.println(isSubsequence(s,t));

    }
    public  static boolean isSubsequence(String s, String t) {
     int n=s.length(),m=t.length(),count=0,k=-1;
        for (int i = 0; i < n; i++) {
            for (int j = k+1; j < m; j++) {
                if (s.charAt(i)==t.charAt(j)){
                    k=j;
                             count++;
                   break;
                }
            }
        }
      return n==count;
    }
}
