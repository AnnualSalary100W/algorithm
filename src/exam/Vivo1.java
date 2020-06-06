package exam;
import java.util.*;
/*
在vivo产线上，每位职工随着对手机加工流程认识的熟悉和经验的增加，日产量也会不断攀升。
假设第一天量产1台，接下来2天(即第二、三天)每天量产2件，接下来3天(即第四、五、六天)每天量产3件 ... ...
以此类推，请编程计算出第n天总共可以量产的手机数量。
 */

public class Vivo1 {

    public static void main(String[] args) {
        int n=11;
        System.out.println(solution(n));
    }

        /**
         *
         * @param n int整型 第n天
         * @return int整型
         */
        public static int solution (int n) {
            // write code here
            int k=1;
            while((1+k)*k<2*n){
                k++;
            }
            int t=n%((1+(k-1))*(k-1)/2);
            int sum=0;
            for(int i=1;i<k;i++){
                sum+=i*i;
            }
            sum=sum+t*k;
            return sum;
        }
    }

