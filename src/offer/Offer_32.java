package offer;

import java.util.Arrays;
import java.util.Comparator;

/*
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，
则打印出这三个数字能排成的最小数字为321323。
 */
public class Offer_32 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,23,32};
        System.out.println(PrintMinNumber(arr));
    }
    public static String PrintMinNumber(int [] numbers) {
        String[] arr= new String[numbers.length];
       for(int i=0;i<numbers.length;i++){
             arr[i]=String.valueOf(numbers[i]);
       }
        Arrays.sort(arr, (o1, o2) -> (o1+o2).compareTo(o2+o1));
       String result="";
       for(String x:arr){
           result+=x;
       }
       return result;
}

}
