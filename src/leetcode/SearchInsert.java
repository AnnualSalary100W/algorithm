package leetcode;

import java.util.Scanner;

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
