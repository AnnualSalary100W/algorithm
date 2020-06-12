package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums=new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
       List<Integer> list=new ArrayList<>();
        List<List<Integer>> list1=new ArrayList<List<Integer>>();
        int n=nums.length;

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j){
                    continue;
                }
               for (int k=0;k<n;k++){
                  if (k==i||k==j){
                      continue;
                  }
                  if (nums[i]+nums[j]+nums[k]==0){
                      list.add(nums[i]);
                      list.add(nums[j]);
                      list.add(nums[k]);
                      list1.add(list);

                  }
                   list.remove(0);
                   list.remove(0);
                   list.remove(0);
               }
            }
        }

return list1;
}
}
