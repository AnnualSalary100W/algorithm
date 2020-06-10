package exam;


import java.util.*;

public class Tencent4{
    public static final int ASD = 1000000007;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int a=sc.nextInt(), x=sc.nextInt();
        int b=sc.nextInt(), y=sc.nextInt();
        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int i=0; i<x ; i++){
            for(int j=k; j>=a; j--){
                dp[j] = (dp[j] + dp[j-a]) % ASD;
            }
        }
        for(int i=0; i<y ; i++){
            for(int j=k; j>=b; j--){
                dp[j] = (dp[j] + dp[j-b]) % ASD;
            }
        }

        System.out.println(dp[k]);
        sc.close();
    }
}