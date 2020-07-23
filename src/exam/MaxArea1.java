package exam;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxArea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }
        System.out.println(max(arr));
    }
    public  static long max(int[] arr){
        int max1=0;
        int max2=0;

        Map<Integer,Integer> first =new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int num=arr[i];
            if (!first.containsKey(num)){
                first.put(num,1);
            }else {
                int count=first.get(num)+1;
                first.put(num,count);
                if (count>1&&num>max1){
                    max2=max1;
                    max1=Math.max(max1,num);
                }
            }
        }
        if (max1<=0){
            return -1;
        }
        if (max2<=0){
            return -1;
        }
        if (first.get(max1)>4){
            return max1*max1;
        }else {
            return max1*max2;
        }
    }

}
