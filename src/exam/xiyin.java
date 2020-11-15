package exam;

import java.util.Scanner;

public class xiyin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.next();
        String str2=scanner.next();
             int minlen=minLength(str1,str2);
        System.out.println(minlen);
    }
    public  static int minLength(String str1,String str2){
        if (str1==null||str2==null||str1.length()<str2.length()){
            return 0;
        }
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();
        int[] map=new  int[256];
        for (int i = 0; i <char2.length ; i++) {
            map[char2[i]]++;
        }
        int left=0;
        int right=0;
        int match=char2.length;
        int minlen=Integer.MAX_VALUE;
        while (right<char1.length){
            map[char1[right]]--;
            if (map[char1[right]]>=0){
                match--;
            }
            if (match==0){
                while (map[char1[left]]<0){
                    map[char1[left++]]++;
                }
                minlen=Math.min(minlen,right-left+1);
                match++;
                map[char1[left++]]++;
            }
            right++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}
