package leetcode;

import java.util.HashMap;
/*
167. 两数之和 II - 输入有序数组

 */
public class TwoSum167 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int[] arr=new int[2];
        int n=numbers.length;
        for(int i=0;i<n;i++){
            if (hashMap.containsKey(numbers[i])){
                for (int j=0;j<i;j++){
                    if (numbers[j]==hashMap.get(numbers[i]))
                   arr[0]=j+1;
                }
                arr[1]=i+1;
            }else {hashMap.put(target-numbers[i],numbers[i]);}
        }
        return  arr;
    }
}
