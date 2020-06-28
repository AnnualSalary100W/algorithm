package leetcode;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int s=7;
        int[] nums=new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(s,nums));
    }
    public  static int minSubArrayLen(int s, int[] nums) {

       int n=nums.length;
        if (s<=0||n<=0){
            return 0;
        }
       int len=Integer.MAX_VALUE;

       for (int i=0;i<n;i++){
           int sum=0;
           int k=i;
           while (sum<s){
               if (k>n-1){
                   break;
               }
               sum=sum+nums[k];
               if (sum>=s){
                   break;
               }
               k++;
           }
           if (k>n-1){
               break;
           }
           len=Math.min(len,(k-i+1));
       }
        return len == Integer.MAX_VALUE ? 0 : len;
    }


    public int minSubArrayLen1(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

}
