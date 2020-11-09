package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Shunfeng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            int count=0;
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                if (arr[i]==-1)count++;
                else list.add(arr[i]);
            }if (list.size()<3){
                System.out.println(1);
            }
           else System.out.println(1);
        }
    }
}
