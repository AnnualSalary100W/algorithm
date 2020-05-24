package offer;

import java.util.Arrays;
import java.util.Comparator;

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
