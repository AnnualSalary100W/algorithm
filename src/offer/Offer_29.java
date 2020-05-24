package offer;

import java.util.ArrayList;
import java.util.Arrays;
/*
输入n个整数，找出其中最小的K个数。
例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Offer_29 {
    public static  ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> arr=new ArrayList<>();
        if (k>input.length){
            return arr;
        }
        for (int i=0;i<k;i++){
            arr.add(input[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] a = new int[]{1,8,9};
        System.out.println(GetLeastNumbers_Solution(a,4));
    }
}
