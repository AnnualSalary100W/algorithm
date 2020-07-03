package leetcode;
/*
股票卖出时机
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices=new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public  static int maxProfit(int[] prices) {
        int n=prices.length;
        int x=0;
        int profit=0;
        int profit1=0;
        while(x<n){
            for(int i=x;i<n;i++){
                profit1=prices[i]-prices[x];
                profit=Math.max(profit,profit1);
            }

            x++;
        }
        return profit;
    }

}
