package handwritten.ByteDance;

public class addStrings415 {

        public static void main(String[] args) {
            String num1="123456";
            String num2="1234567";
            System.out.println(addstrings(num1,num2));
        }
        public  static String addstrings(String num1,String num2){
            StringBuffer res=new StringBuffer("");
            int i=num1.length()-1,j=num2.length()-1,count=0;
            while (i>=0||j>=0){
                int n=i>=0 ? num1.charAt(i)-'0':0;
                int m=j>=0 ? num2.charAt(j)-'0':0;
                int tem=n+m+count;
                count=tem/10;
                res.append(tem%10);
                i--;
                j--;
            }
            if (count==1){
                res.append(1);
            }
            return res.reverse().toString();
        }
    }

