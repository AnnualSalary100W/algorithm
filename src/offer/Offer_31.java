package offer;

import java.util.ArrayList;

public class Offer_31 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(2000));
    }
    public static int NumberOf1Between1AndN_Solution(int n) {

        int count=0;
        for(int i=0;i<=n;i++){
            int x=i;
while (x!=0){
    if (x%10==1){
        count++;
    }
    x=x/10;
}
        }
        return count;
    }
}
