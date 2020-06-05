package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;


public class Offer_62 {
    public static void main(String[]args){
int[] num=new int[]{2,3,4,2,6,2,5,1};
int size=3;
        System.out.println(maxInWindows(num,size));
    }
    public  static  ArrayList<Integer> maxInWindows(int [] num, int size)
    {

        ArrayList<Integer> list  = new ArrayList<Integer> ();
        if(size>num.length||size==0)
            return list;
        for(int i = 0;i<=num.length-size;i++){
            int max = num[i];
            for(int j = i+1;j<i+size;j++){
                if(num[j]>max){
                    max = num[j];
                }
            }
            list.add(max);
        }
        return list;
    }



}
