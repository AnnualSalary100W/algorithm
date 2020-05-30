package exam;

import java.util.ArrayList;
import java.util.Arrays;
/*
给定数组penny及它的大小(小于等于50)，同时给定一个整数aim，请返回有多少种方法可以凑成aim。
测试样例：
[1,2,4],3,3
返回：2
 */
public class Nowcoder {
    public static void main(String[] args)
    {
        int[] penny = {1,2,4};
        int n=3, aim=3;
        int num = countWays(penny,n,aim);
        System.out.println(num);
    }

    public static int countWays(int[] penny, int n, int aim) {


            if(n==0||penny==null||aim<0){
                return 0;
            }
            int[][] pd=new int [n][aim+1];
            for(int i=0;i<n;i++){
                pd[i][0]=1;
            }
            for(int i=1;penny[0]*i<=aim;i++){
                pd[0][penny[0]*i]=1;
            }
            for(int i=1;i<n;i++){
                for(int j=0;j<=aim;j++){
                    if(j>=penny[i]){
                        pd[i][j]=pd[i-1][j]+pd[i][j-penny[i]];
                    }else{
                        pd[i][j]=pd[i-1][j];
                    }
                }
            }
            return pd[n-1][aim];
        }
}
