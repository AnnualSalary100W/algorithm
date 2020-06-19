package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class IsPalindrome1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
          int n=s.length();
          int left=0;
          int right=n-1;
          while (left<right){
              while (left<right&&!Character.isLetterOrDigit(s.charAt(left))){
                  ++left;
              }
              while (left<right&&!Character.isLetterOrDigit(s.charAt(right))){
                  --right;
              }
              if (left<right){
                  if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
                      return false;
                  }
                  ++left;
                  --right;
              }


          }
          return true;
    }
}
