package handwritten.huawei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println(type(n,arr));
    }

    public  static long type(int n,int[] arr){

        long number=1;
        Arrays.sort(arr);
        if (arr[0]!=0){
            return 0;
        }
        int m=arr[n-1];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if (hashMap.containsKey(arr[i])){
                int k=hashMap.get(arr[i]);
                hashMap.put(arr[i],k+1);
            }else {
                hashMap.put(arr[i],1);
            }
        }
        for (int i = 0; i <=m ; i++) {
            if (Math.pow(2,i)-hashMap.get(i)==0){
                continue;
            }
          number= (long) (number* (Math.pow(2,i)-hashMap.get(i)))%1000000009;
        }
        return number;
    }
}
