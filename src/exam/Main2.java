package exam;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int j = 0; j <n ; j++) {
            String s="";
            for (int i = 0; i <7 ; i++) {
                s+=in.next()+" ";
            }

        if (isOk(s)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    }
  public  static boolean isOk(String s){
        String[] a=s.split(" ");
        int[] r=new int[10];
        String t="";
      String w="";
      String b="";

      for (String temp:a){
          if (temp.charAt(1)=='T'){
              if (r[temp.charAt(0)-'0']!=0){
              return false;
          }else {
              r[temp.charAt(0)-'0']=1;
          }
          t+=temp.charAt(0);
      }else if (temp.charAt(1)=='W'){
          if (r[temp.charAt(0)-'0']!=0){
              return false;
          }else {
              r[temp.charAt(0)-'0']=2;
          }
              w+=temp.charAt(0);
          }else if (temp.charAt(1)=='B'){
              if (r[temp.charAt(0)-'0']!=0){
                  return false;
              }else {
                  r[temp.charAt(0)-'0']=3;
              }
              b+=temp.charAt(0);
          }
      }
      if (t.length()>3||w.length()>3||b.length()>3){
          return false;
      }
      for (int i = 0; i < 4; i++) {
          int k=r[i];
          if(k==0)continue;
          if ((r[i+3]==k||r[i+3]==0)&&(r[i+6]==k||r[i+6]==0)){

          }else {
              return false;
          }
      }
      return true;
  }
}
