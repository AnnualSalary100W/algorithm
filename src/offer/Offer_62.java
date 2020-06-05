package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
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
