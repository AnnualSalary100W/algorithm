package exam;
import java.util.*;
/*
Z国的货币系统包含面值1元、4元、16元、64元共计4种硬币，以及面值1024元的纸币。
现在小Y使用1024元的纸币购买了一件价值为的商品，请问最少他会收到多少硬币？
 */
public class BetyDance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=scanner.nextInt();
        System.out.println(betydance(sum));
    }

 public static int betydance(int sum){

        int sum1=1024-sum;
     int count1=0;
     int  sum2=0;
     int count2=0;
     int sum3=0;
     int count3=0;
     int sum4=0;
        if (sum1>=64){
            count1=sum1/64;
            sum2=sum1%64;
           count2=sum2/16;
          sum3=sum2%16;
         count3=sum3/4;
          sum4=sum3%4;
        }
        if (sum1<64){
            if (sum1>=16){
                count2=sum1/16;
                sum3=sum1%16;
                count3=sum3/4;
                sum4=sum3%4;
            }
        }
     if (sum1<16){
         if (sum1>=4){
             count3=sum3/4;
             sum4=sum3%4;
         }
     }
     if (sum1<4){
         return sum1;
     }

      return count1+count2+count3+sum4;
 }

}
