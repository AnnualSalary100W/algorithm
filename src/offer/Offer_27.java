package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/*
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。

 */
public class Offer_27 {
    private  TreeSet result;
    public ArrayList<String> Permutation(String str) {
     if (str==null||str.length()<1){
         return new ArrayList<>();
     }
        List<Character> chars =new ArrayList<>();
          result=new TreeSet<>();
     for (char c : str.toCharArray()){
         chars.add(c);
     }
     Compose(chars,new StringBuffer(),str.length(),0);
     return new ArrayList<>(result);
    }


    private void Compose(List<Character>arr,StringBuffer buffer,int len,int index){
        //递归结束条件
        if(index==len){
            result.add(buffer.toString());
            return;
        }
        for(int i=0;i<arr.size();i++){
            char c=arr.get(i);
            buffer.append(c);
            arr.remove(i);
            Compose(arr,buffer,len,index+1);
            arr.add(i,c);
            buffer.deleteCharAt(buffer.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println( new Offer_27().Permutation("abc"));
    }
}
