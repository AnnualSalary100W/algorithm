package offer;

import java.util.ArrayList;
import java.util.List;

public class Offer_23 {

    public  static boolean  VerifySquenceOfBST(int [] sequence) {
        List<Integer> list =new ArrayList<>();
        if (sequence==null){
            return false;
        }
        if (sequence.length<1){
            return false;}
        for (int num:sequence)
            list.add(num);
        return VerifyBST(list);

    }
    public  static  boolean VerifyBST(List<Integer> sequence) {
        if(sequence.size()<1){
            return true;
        }
        int x=sequence.size();
        int y=sequence.get(x-1);

        List<Integer> leftList=new ArrayList<>();
        List<Integer> rightList=new ArrayList<>();
        int i=0;
        while (sequence.get(i)<y){
            leftList.add(sequence.get(i++));
        }
        while (sequence.get(i)>y){
            rightList.add(sequence.get(i++));
        }
        if (i<sequence.size()-1){
            return false;
        }
        return VerifyBST(leftList)&&VerifyBST(rightList);
    }

    public static void main(String[] args) {
        System.out.println(VerifySquenceOfBST(null));
    }
}
