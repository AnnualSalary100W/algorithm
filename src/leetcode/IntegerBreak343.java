package leetcode;

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
