package exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Aoe {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y=scanner.nextInt();
        scanner.nextLine();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int[] arr1=new int[x];
        int[] arr2=new int[x];

        for (int i=0;i<x;i++){
          arr1[i]=scanner.nextInt();
          arr2[i]=scanner.nextInt();
          scanner.nextLine();
        }
        for (int i=0;i<x;i++){
           hashMap.put(arr1[i],arr2[i]);
        }

        Arrays.sort(arr1);






    }
}
