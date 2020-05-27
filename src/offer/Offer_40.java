package offer;

import java.util.HashMap;

public class Offer_40 {

    public static  void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (hashMap.containsKey(array[i])){
                hashMap.remove(array[i]);
            }else {
                hashMap.put(array[i],array[i]);
            }
        }

        for (int i=0;i<array.length;i++){
            if (hashMap.containsKey(array[i])){
                num1[0]=array[i];
              hashMap.remove(array[i]);
              break;
            }
        }
        for (int j=0;j<array.length;j++){
            if (hashMap.containsKey(array[j])){
                num2[0]=array[j];
            }
        }


    }
}
