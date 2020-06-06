package exam;
import java.util.*;
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

