package exam;
/*
扒开礼物，去括号
 */

public class Vivo5 {


    private static int solution(String str) {

        // TODO Write your code here
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!='0'){
                if (str.charAt(i)=='('){
                    count++;
                }
                if (str.charAt(i)==')'){
                    count--;
                }
            }else
                break;
        }
        return count;
    }
}
