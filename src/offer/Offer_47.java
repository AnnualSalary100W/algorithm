package offer;
/*
求1+2+3+...+n，
要求不能使用乘除法、for、while、if、else、switch、case等关键字
及条件判断语句（A?B:C）。
 */
public class Offer_47 {
    public int Sum_Solution(int n) {
    return (int)(Math.pow(n,2)+n)>>1;

    /*
    int sum=n;
    boolean flag=（n>0）&&(sum+=Sum_Solution（n-1）)>0;
    retur sum；
     */

    }
}
