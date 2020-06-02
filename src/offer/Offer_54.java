package offer;
/*
请实现一个函数用来找出字符流中第一个只出现一次的字符。
例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Offer_54 {
    HashMap<Character,Integer> hashMap=new HashMap<>();
    ArrayList<Character> list=new ArrayList<>();
    public void Insert(char ch)
    {

        if (hashMap.containsKey(ch)){
            hashMap.put(ch,(hashMap.get(ch)+1));
        }else {
            hashMap.put(ch,1);
        }
        list.add(ch);

    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char c='#';
        for(char key : list){
            if(hashMap.get(key)==1){
                c=key;
                break;
            }
        }

        return c;
    }
}
