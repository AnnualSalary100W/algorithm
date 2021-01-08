package leetcode;

public class Rotate1 {
    public static int[] rotate(int[] nums, int k) {
       int n = nums.length;
       int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[(i+k) % n] = nums[i];
        }
        System.arraycopy(nums1,0, nums ,0 , n);
        return nums;
    }

    public static void main(String[] args) {
            int nums[] ={1,2,3,4,5,6,7};
            int k = 3;
        rotate(nums,k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println( nums[i]);
        }



    }
}
