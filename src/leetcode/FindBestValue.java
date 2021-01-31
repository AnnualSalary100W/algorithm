package leetcode;

import java.util.Arrays;

public class FindBestValue {

    public static void main(String[] args) {
        int[] arr=new int[]{4,9,3};
        int target=10;
        System.out.println(findBestValue(arr,target));
    }
    public  static int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]*(len-i)>target){
                int ans=target/(len-i);
                return Math.abs(ans*(len-i)-target)>Math.abs((ans+1)*(len-i)-target)?ans+1:ans;
            }
            else{
                target-=arr[i];
            }
        }
        return arr[len-1];

    }
}
