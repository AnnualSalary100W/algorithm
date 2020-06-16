package leetcode;

import java.util.Scanner;
/*
判断一个整数是否是回文数。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 */
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(isPalindrome(x));
    }
    public  static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int n= s.length();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.charAt(i);
        }
        for (int j=0;j<n;j++){
            arr1[j]=s.charAt(n-1-j);
        }
        for (int k=0;k<n;k++){
           if (arr[k]!=arr1[k]){
               return false;
           }
        }
        return true;

    }
}
