package exam;
import java.util.*;
public class Tencent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();

        int[] arr=new int[sum];
        for (int i=0;i<sum;i++){
            arr[i]=sc.nextInt();
        }
if (sum==0){
    System.out.println("0");
}

        int maxl=0;

        for(int m=0;m<sum;m++){
            int count=1;
            if(m<sum-1){
                maxl=arr[m+1];
                for (int n=m+1;n<sum;n++){
                    if (maxl<=arr[n]){
                        maxl=arr[n];
                        count++;
                    }
                }
            }

                if (m>=1){
                    maxl=arr[m-1];
                    for (int n=m-1;n>=0;n--){
                        if (maxl<=arr[n]){
                            maxl=arr[n];
                            count++;
                        }
                    }
                }

            System.out.printf(count+" ");

        }
    }


}
