package offer;

/*
将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
数值为0或者字符串不是一个合法的数值则返回0
 */
public class Offer_49 {
    public int StrToInt(String str) {
       int len=str.length();
       int index=0;
       //第一步，删除前面的空格
        while (index<len){
            if (str.charAt(index)==' '){
                index++;
            }else {
                break;
            }
        }
        int flag=0;
        long ans=0;//最终返回结果
        while (index<len){
            if (str.charAt(index)=='-'||str.charAt(index)=='+'){
                if (flag!=0){
                    return  0;//"-123-1",第二个-是非法字符
                }
                flag=str.charAt(index)=='-'?-1:1;
            }else if (str.charAt(index)>='0'&&str.charAt(index)<='9'){
                ans=ans*10+(str.charAt(index)-'0');
                if (judge(ans,flag)){
return Integer.parseInt(str);
                }
            }else {
                return 0;
            }
            index++;
        }
return flag==-1?(int)ans*(-1):(int)ans;
    }

    private static boolean judge(long ans, int flag) {
        if (flag==-1){
            if (ans*(-1)<Integer.MIN_VALUE){
                return true;
            }
            return false;
        }else {
            if (ans>Integer.MAX_VALUE){
                return true;
            }
            return false;
        }
    }
}
