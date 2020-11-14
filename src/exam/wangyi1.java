package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class wangyi1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Map<Integer,Integer> map=new TreeMap<>();
        int[] arr1=new int[m];
        int[] arr2=new int[m];
        int[] arr3=new int[m];
        for (int i = 0; i <m ; i++) {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
            arr3[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(max(m,arr1,arr2));
        }
    }
    public static int max(int m,int[] arr1,int[] arr2){
        Map<Integer,Integer> map=new TreeMap<>();
        int max=0;
        int max1=0;
        for (int i = 0; i <m ; i++) {
            if (map.containsKey(arr2[i])){
                max=Math.max(arr1[i]-map.get(arr2[i]),max);
                if (max==arr1[i]-map.get(arr2[i])){
                    max1=arr2[i];
                }
            }else {
                map.put(arr2[i],arr1[i]);
            }

        }
        return max1;



    }
}
