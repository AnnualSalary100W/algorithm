package leetcode;

import java.util.Arrays;


public class BackspaceCompare {
    public static void main(String[] args) {
        String S =  "a#c";
        String T =  "b";


        System.out.println(backspaceCompare(S,T));
    }
    public static boolean backspaceCompare(String S, String T) {
         int  n = S.length(),m = T.length();
         StringBuffer str1 = new StringBuffer();
         StringBuffer str2 = new StringBuffer();

        for (int i = 0; i < n; i++) {
            if (S.charAt(i) != '#') str1.append(S.charAt(i));
            if (S.charAt(i) == '#' &&  str1.length()!=0){
                int k = str1.length();
                str1.deleteCharAt(k-1);
            }
        }
        for (int i = 0; i < m; i++) {
            if (T.charAt(i) != '#') str2.append(T.charAt(i));
            if (T.charAt(i) == '#' && str2.length()!=0){
                int k = str2.length();
                str2.deleteCharAt(k-1);
            }
        }
        return String.valueOf(str1).equals(String.valueOf(str2))  ;
    }
}
