package offer;
/*

 */

import java.util.ArrayList;

public class Offer_42 {
    public static void main(String[] args) {
        int[] array=new  int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum=21;
        System.out.println(FindNumbersWithSum(array,sum));
    }
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> list=new ArrayList<>();
           int n=array.length;
        for (int a=0;a<n;a++){
            for(int b=0;b<n;b++){
                if (array[a]+array[b]==sum ){
                    if (a<b){
                        list.add(array[a]);
                        list.add(array[b]);
                        return list;
                    }
                }
            }
             }
        return list ;
    }
}
