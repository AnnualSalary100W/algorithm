package offer;

import java.util.ArrayList;
import java.util.List;
/*
 * 输入一个非空整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 *
 */

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
