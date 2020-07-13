package leetcode;
/*
两个数组的交集 II
 */

import java.util.Arrays;


public class Intersect {
    public static void main(String[] args) {
        int[] nums1=new int[]{4,9,5};
        int[] nums2=new int[]{9,4,9,8,4};

        int[] arr=new int[]{};
 arr=intersect(nums1,nums2);
        System.out.println(arr.toString());
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int[] intersection = new int[Math.min(length1, length2)];
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < length1 && index2 < length2) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                intersection[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);


        }




}
