package exam;

/*
小Q有X首长度为A的不同的歌和Y首长度为B的不同的歌，
现在小Q想用这些歌组成一个总长度正好为K的歌单，
每首歌最多只能在歌单中出现一次，
在不考虑歌单内歌曲的先后顺序的情况下，
请问有多少种组成歌单的方法。
 */
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