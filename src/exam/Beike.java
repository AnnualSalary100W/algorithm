package exam;

import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.Scanner;

public class Beike {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//            sc.nextLine();
//            String s=sc.nextLine();
//        System.out.println(string(n,s));
//    }
//    public static int string(int n,String s){
//        int count=0;
//        StringBuilder sb=new StringBuilder(s);
//        sb.reverse();
//        for (int i = 0; i < sb.length(); i++) {
//            if (sb.charAt(i)!=s.charAt(i)){
//                count++;
//            }
//        }
//        return count/2;
//    }
      public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    int[] arr=new int[n];
          ArrayList list=new ArrayList();
          for (int i = 0; i <n ; i++) {
              int N=sc.nextInt();
              int M=sc.nextInt();
              sc.nextLine();
              list.add(color(N,M));
          }
          for (int i = 0; i <n ; i++) {
              System.out.println(list.get(i));

          }
}
      public  static long color(int N,int M){
       long count=N*M;
      long min=Integer.MAX_VALUE;
      if (N%2==0&&M%2==0){
      return 2;}

        for (int i = 2; i <=N ; i++) {
            if (N%i==0){
               min=Math.min(min,i);
            }}
          for (int i = 2; i <=M; i++) {
              if (M%i==0){
                  min=Math.min(min,i);
              }}

        return min;


}
}
