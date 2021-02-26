package offer;
import java.util.Arrays;
/*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
如果不存在则输出0。
 */
public class Offer_28 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        int count=0;
        Arrays.sort(array);
        int mid=array.length/2;
        for(int i=0;i<array.length;i++){
          if (array[i]==array[mid]){
              count++;
          }
        }
if (count>mid){
    return array[mid];
}else {
    return 0;
}

    }

    public static void main(String[] args) {
        int [] a = new int[]{1,2,2,4,2};
        System.out.println(MoreThanHalfNum_Solution(a));
    }
}
