package offer;

public class Offer_43 {
    public static void main(String[] args) {
        String str=new String("abcXYZdef");
        System.out.println(LeftRotateString(str,3));
    }
    public  static String LeftRotateString(String str,int n) {
        int x=str.length();
        if(n>x){
            return "";
        }
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=n;i<x;i++){
            char c=str.charAt(i);
            stringBuffer.append(c);
        }
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }
}
