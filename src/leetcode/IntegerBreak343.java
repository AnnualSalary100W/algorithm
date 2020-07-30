package leetcode;
/*
给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。

 */
public class IntegerBreak343 {

    public int integerBreak(int n) {
           if(n<2||n>58){
               return -1;
           }
           if (n==2||n==3){
               return n-1;
           }

           int count=n/3;
           int count1=n%3;
           int res=1;
           if (count1==0){
               for (int i = 0; i <count ; i++) {
                   res=res*3;
               }
           }
           if (count1==1){
               res=4;
               for (int i = 0; i <count-1 ; i++) {

                   res=res*3;
               }
           }
           if (count1==2){
               res=2;
               for (int i = 0; i <count ; i++) {

                   res=res*3;

               }
           }

           return res;
    }
}
