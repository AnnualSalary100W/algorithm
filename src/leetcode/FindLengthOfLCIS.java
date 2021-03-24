package leetcode;

public class FindLengthOfLCIS {
    
    public static void main(String[] args) {
         int[] arr= new int[]{2,2,2,2,2};
        System.out.println(findLengthOfLCIS(arr));
    }
    public static int findLengthOfLCIS(int[] nums) {
         int n = nums.length;
         if (n == 0) return 0;
         int maxNumber = 1;
         int res = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                maxNumber++;
                res = Math.max( res , maxNumber);
            }else {
                maxNumber = 1;
            }
        }
        return res;
    }
}
