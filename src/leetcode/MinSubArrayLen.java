package leetcode;
/*
给定一个含有 n 个正整数的数组和一个正整数 s
找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度
如果不存在符合条件的连续子数组，返回 0。
 */
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
