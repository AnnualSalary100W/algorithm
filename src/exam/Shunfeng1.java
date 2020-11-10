package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Shunfeng1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
        int k= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
         arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count =0;
        int count1=0;
        for (int i = 0; i <k ; i++) {
            count+=arr[i]*arr[i];
        }
        for (int i =k ; i <n ; i++) {
            count1+=arr[i];
        }
        count=count+count1*count1;
        int count2=0;

        for (int i = 0; i <n ; i++) {
            if (arr[i]==0)count2++;
        }
        System.out.println(count+" "+(n-k-(count2-k)));
    }
}
