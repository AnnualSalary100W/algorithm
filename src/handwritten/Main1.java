package handwritten;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] ss=sc.nextLine().trim().split("\\s+");//读取一行字符串，并用空格切割
         int[] ary=new int[ss.length];//构造一个整型数组
     for(int i=0;i<ary.length;i++){
       ary[i]=Integer.parseInt(ss[i]);//从字符串转换成整型
      }

      int target=sc.nextInt();

        System.out.println(Search(ary,target));
    }
    public  static int Search(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int mid=left+(right-left)/2;
        while (left<right){
             mid=left+(right-left)/2;
            if (arr[mid]<target) {left =mid+1;continue;}
            if (arr[mid]>target) {right=mid-1;continue;}
            else return mid;
        }
        return mid;
    }
}
