package leetcode;

import java.util.HashMap;
import java.util.HashSet;


public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int n=nums.length;
        int m=1;
        for (int i=0;i<n;i++){
            hashMap.put(i,nums[i]);
        }
        for (int j=1;j<=n+1;j++){
            if (hashMap.containsValue(j)){
                continue;
            }else {
                m=j;
                break;
            }
        }
        return m;
    }
}
