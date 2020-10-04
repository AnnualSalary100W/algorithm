package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[]  arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println(twoSum(arr,n));
    }
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap hashMap=new HashMap<>();
        int[] res=new int[2];
        int a=0;
        for(int i=0;i<n;i++){
            if(hashMap.containsValue(target-nums[i])){
                res[1]=i;
               a=i;
            }else hashMap.put(i,nums[i]);
        }
        int b=target-nums[a];
        for (int i = 0; i <n ; i++) {
            if (nums[i]==b){
                res[0]=i;
            }
        }
        return res;
    }
}
