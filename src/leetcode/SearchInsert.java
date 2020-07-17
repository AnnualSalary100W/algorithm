package leetcode;

import java.util.Scanner;
/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
你可以假设数组中无重复元素。

 */

public class SearchInsert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        sc.nextLine();
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.nextLine();
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;


    }
}
