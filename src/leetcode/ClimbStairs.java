package leetcode;

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
