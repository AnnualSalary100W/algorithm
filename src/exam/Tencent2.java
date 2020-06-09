package exam;
import java.util.*;
public class Tencent2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
      sc.nextLine();
      int[] arr=new int[n];
      for (int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      sc.nextLine();
        System.out.println(tencent2(n,arr));
    }
    public static int tencent2(int n,int[] arr){
        Arrays.sort(arr);
        int count1=0;
        int count2=0;
        for (int i=n-1;i>=0;i=i-2){
           count1=count1+arr[i];
        }
        for (int i=n-2;i>=0;i=i-2){
            count2=count2+arr[i];
        }
        return count1-count2;
    }
}
