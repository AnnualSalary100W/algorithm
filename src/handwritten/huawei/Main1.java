package handwritten.huawei;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String[] line=sc.nextLine().split(" ");
       int m=Integer.parseInt(line[0]);
       int n=Integer.parseInt(line[1]);
       if (m*n<17){
           System.out.println("[]");
       }else {
           int top=0;
           int left=0;
           int down=m-1;
           int right=n-1;
           int count =0;
           StringBuilder sb=new StringBuilder();
           sb.append("[");
           while (count<m*n){
               for (int i = left; i <=right ; i++) {
                   count++;
                   if (isOk(count)){
                       sb.append("["+top+","+i+"],");
                   }
               }
               top++;
               if (count>=m*n)break;
               for (int i = top; i <=down ; i++) {
                   count++;
                   if (isOk(count)) {
                       sb.append("["+i+","+right+"],");
                   }
               }
               right--;
               if (count>=m*n)break;
               for (int i = right; i >=left ; i--) {
                   count++;
                   if (isOk(count)){
                       sb.append("[" +down+ ","+i+"],");
                   }

               }
               down--;
               if (count>=m*n)break;
               for (int i = down; i >=top ; i--) {
                   count++;
                   if (isOk(count)){
                       sb.append("["+i+","+left+"],");
                   }
               }
               left++;
           }
           sb.delete(sb.length()-1,sb.length());
           sb.append("]");
           System.out.println(sb.toString());
       }

    }
 public static  boolean isOk(int count){
        if (count<10)return false;
        String str=String.valueOf(count);
        int n=str.length();
        if (str.charAt(n-1)=='7'&&(str.charAt(n-2)-'0')%2==1)
            return true;
        return false;
 }

}
