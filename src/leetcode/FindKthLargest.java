package leetcode;


import java.util.Arrays;
/*
数组中的第K个最大元素
 */

public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums=new int[]{3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        int m=nums.length;
        if (k<1||k>m){
            return 0;
        }
        return nums[m-k];
    }
}
