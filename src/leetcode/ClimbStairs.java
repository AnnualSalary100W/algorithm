package leetcode;
/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public  static int climbStairs(int n) {
           int sum=0;
           int x=1;
           int y=2;
           if (n==1){
               return 1;
           }
           if (n==2){
               return 2;
           }
           for(int i=0;i<n-2;i++){
               sum=x+y;
               x=y;
               y=sum;
           }
           return sum;
    }
}
