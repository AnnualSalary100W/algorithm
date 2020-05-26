package exam;

import java.util.Scanner;
/*
牛牛准备参加学校组织的春游, 出发前牛牛准备往背包里装入一些零食, 牛牛的背包容量为w。
牛牛家里一共有n袋零食, 第i袋零食体积为v[i]。
牛牛想知道在总体积不超过背包容量的情况下,他一共有多少种零食放法(总体积为0也算一种放法)。
输入描述:输入包括两行
第一行为两个正整数n和w(1 <= n <= 30, 1 <= w <= 2 * 10^9),表示零食的数量和背包的容量。
第二行n个正整数v[i](0 <= v[i] <= 10^9),表示每袋零食的体积。
输出描述:
输出一个正整数, 表示牛牛一共有多少种零食放法。
输入
3 10
1 2 4
输出
8
说明：三种零食总体积小于10,于是每种零食有放入和不放入两种情况，一共有2*2*2 = 8种情况。
 */

public class Backup {
    private static int count =0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            count=0;
            int n=scanner.nextInt();
            int w=scanner.nextInt();
            int[] nums=new int[n];
            long sum=0;
            for (int i=0;i<n;i++){
                nums[i]=scanner.nextInt();
                sum += nums[i];
            }
            if (sum<=w){
                //小于总容量直接返回2的N次幂
                System.out.println((int)Math.pow(2,n));
            }else {
                dfs(0,0,n,nums,w);
                //都不添加也是一种情况
                System.out.println(count+1);
            }
            }
        }
    private static void dfs(long sum, int cur, int n, int[] nums, int w) {
        if (cur<n){
            if (sum>w){
                return;
            }
            //不加这件零食
            dfs(sum,cur+1,n,nums,w);
            //添加合理，加
            if (sum+nums[cur]<=w){
                count++;
                dfs(sum+nums[cur],cur+1,n,nums,w);
            }
        }
    }
}




