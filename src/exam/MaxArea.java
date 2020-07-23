package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaxArea {
    public static void main(String[] args) {
        int[] arr=new int[]{10,1,1,2,3,4,4,5,6,8,8,9,6,9,10};
        System.out.println(maxarea(arr));
    }
    public  static  long maxarea(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i=0;i<n;i++){
            if (hashMap.containsKey(arr[i])){
              int count=hashMap.get(arr[i]);
                if (1<count&&count<4){
                    continue;
                }else {
                    list.add(arr[i]);
                }

            }else {
                hashMap.put(arr[i],1);
            }
        }

        int m=list.size();
        if (m<2){
            return -1;
        }

        int[] arr1=new int[m+1];

        for (int j=0;j<m;j++){
            arr1[j]=list.get(j);
        }
        Arrays.sort(arr1);

        long max=arr1[m]*arr1[m-1];

        return max;
    }

}
