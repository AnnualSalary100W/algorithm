package leetcode;

import java.util.ArrayList;

public class divingBoard1611 {
    public static void main(String[] args) {
        int shorter=1;
        int longer =2;
        int k=3;
       int[] arr=divingBoard(shorter,longer,k);
        System.out.print("{");
  for (int i=0;i<k;i++){

      System.out.print(arr[i]+",");
  }
        System.out.print(arr[k]);
        System.out.print("}");

    }
    public  static int[] divingBoard(int shorter, int longer, int k) {
        int[] arr=new int[k+1];
        if(k<1){
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }

        for (int i=0;i<=k;i++){
            arr[i]=(shorter*(k-i)+longer*i);
        }
        return arr;
    }
}
