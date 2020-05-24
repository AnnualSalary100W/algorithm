package offer;

import java.util.ArrayList;
import java.util.Arrays;
/*
求出1~13的整数中1出现的次数,
并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
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
