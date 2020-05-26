package offer;
/*
统计一个数字在排序数组中出现的次数。
 */
public class Offer_37 {
    public int GetNumberOfK(int [] array , int k) {
        int count =0;
           for (int i=0;i<array.length-1;i++){
               if (array[i]==k){
                   count++;
               }
           }
           return count;
    }
}
