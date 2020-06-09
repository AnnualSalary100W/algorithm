package exam;
import java.util.*;
public class Tencent1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        System.out.println(tencent1(n,m));
    }
    public  static  long tencent1(int n ,int m){
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=i+1;
        }
        long k=n/(2*m);
        long sum=m*m*k;
        return sum;
    }

}
