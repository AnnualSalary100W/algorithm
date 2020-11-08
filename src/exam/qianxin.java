package exam;

import java.util.ArrayList;

public class qianxin {
    public static void main(String[] args) {

    }
    public int[][] threeSumEqualtoK (int[] arr, int k) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if (arr.length<3)return new int[0][0];
        for (int i = 0; i <arr.length ; i++) {
             int begin=i+1;
             int end=arr.length-1;
             int target=k-arr[i];
             if (arr[i]==arr[i+1])continue;
             while (begin<end){
                 if (arr[begin]+arr[end]>target){
                     end--;
                 }else if (arr[begin]+arr[end]<target){
                     begin++;
                 }else {
                   list.add(i);
                   list.add(begin);
                   list.add(end);
                   res.add(list);
                   list.remove(0);
                     list.remove(1);
                     list.remove(2);
                 }
             }
        }
       return new int[0][0];
    }
}
