package leetcode;

import java.util.Arrays;
/*
给定一个包括 n 个整数的数组 nums 和 一个目标值 target
找出 nums 中的三个整数，使得它们的和与 target 最接近
返回这三个数的和。假定每组输入只存在唯一答案。
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
           int[] nums=new int[]{-55,-24,-18,-11,-7,-3,4,5,6,9,11,23,33};

           int target=0;
        System.out.println(threeSumClosest(nums,target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++) {
            int start = i+1, end = nums.length - 1;
            while(start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if(sum > target)
                    end--;
                else if(sum < target)
                    start++;
                else
                    return ans;
            }
        }
        return ans;
    }
}
