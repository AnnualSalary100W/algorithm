package handwritten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Reletive_7 {
    public int reletive_7 (int[] digit) {
        // write code here
        String []arr=new String[digit.length];
        for (int i = 0; i <digit.length ; i++) {
            arr[i]=""+digit[i];
        }
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> arrayList=listAll(Arrays.asList(arr),"",list);
        int count=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i)%7==0){
                count++;
            }
        }
        System.out.println(count);
        return count;

    }


    public ArrayList<Integer> listAll(List list1, String x, ArrayList<Integer> list){
        if (list1.isEmpty()){
            list.add(Integer.parseInt(x));
        }
        for (int i=0;i<list1.size();i++){
            List temp=new LinkedList(list1);
            String s=x+temp.remove(i);
            listAll(temp,s,list);
        }
        return list;
    }
}
