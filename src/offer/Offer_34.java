package offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*

在一个字符串(0<=字符串长度<=10000，
全部由字母组成)中找到第一个只出现一次的字符,
并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 */
public class Offer_34 {
    public int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1 );
        }
        for (int i=0;i<str.length();i++){
            if (map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
