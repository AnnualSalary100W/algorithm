package offer;
/*
请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class Offer_52 {


    public boolean ismatch(String s, String p)
    {
        return solve(s,p,0,0);

}

    private static boolean solve(String s, String p, int index1, int index2) {
       //递归终止条件一
        if (index1==s.length()&&(index2==p.length()||(index2+1==p.length()-1&&p.charAt(index2+1)=='*'))){
            return true;
        }

        //递归终止条件二
        if (index1==s.length()||p.length()==index2){
            if (index1==s.length()){
                return change(p,index2);
            }else {
                return false;
            }
        }

       if (index2+1<p.length() && p.charAt(index2+1)=='*'){
if (judge(s.charAt(index1),p.charAt(index2))){
return solve(s,p,index1,index2+2)||solve(s,p,index1+1,index2);
}else {
    return solve(s,p,index1,index2+2);
}
       }

        //当前两个小标所指的字符匹配
        if (judge(s.charAt(index1),p.charAt(index2))){
             return solve(s,p,index1+1,index2+1);
        }
        return false;//当前的index1所指的字符与index2的字符不一致
    }

    private static boolean change(String p, int index2) {
        while (index2<p.length()){
            if (index2+1<p.length()&&p.charAt(index2+1)=='*'){
                index2+=2;
            }else {return false;}
        }
        return true;
    }

    /**
     *
     * @param s1 字符1
     * @param s2 字符2
     * @return 两个字符是否匹配的结果
     */
    private static boolean judge(char s1, char s2) {
        if (s1==s2||s2=='.'){
            return true;
        }
        return false;
    }
    public boolean match(char[] str, char[] pattern)
    {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2= new StringBuilder();
        for (char x:str){
            s1.append(x);
        }
        for (char x:pattern){
            s2.append(x);
        }
        return solve(s1.toString(),s2.toString(),0,0);
    }
}
