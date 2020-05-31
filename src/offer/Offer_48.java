package offer;
/*
写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Offer_48 {
    public static void main(String[] args) {
        System.out.println(Add(13,2));
    }
    public static int Add(int num1,int num2) {
return Math.addExact(num1,num2);
    }
}
