package offer;

import java.util.ArrayList;
import java.util.Arrays;

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
