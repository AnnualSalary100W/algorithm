package handwritten;

import java.util.HashMap;
import java.util.Scanner;

public class haikang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(LengthOfString(s));
    }

    public static int LengthOfString(String s){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int n=s.length();
        for (int i = 0; i <n ; i++) {
             if (hashMap.containsKey(s.charAt(i))){
                 hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
             } else hashMap.put(s.charAt(i),1);
        }
        int count=0;
        int flag=0;
        for (int i = 0; i <n ; i++) {
            if (hashMap.get(s.charAt(i))==1) flag=1;

         if  (hashMap.get(s.charAt(i))%2==0) count+=hashMap.get(s.charAt(i));

        }
        if (flag==1){
            count=count+1;
        }
        return count;
    }
}
