package offer;

import java.util.Scanner;


/**
 *  最后一个单词的长度
 */

public class LengthOfLastWord {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String line=sc.nextLine();

        System.out.println(lengthOfLastWord(line));

    }

   public static int lengthOfLastWord(String s){
        int count =0;
        int index =s.length()-1;
        while (index>=0&&s.charAt(index)==' '){
            index--;
        }
        for (int i =index;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
}
