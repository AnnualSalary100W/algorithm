package exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
在一块长为n，宽为m的场地上，有n✖️m个1✖️1的单元格。每个单元格上的数字就是按照从1到n和1到m中的数的乘积.
 给出一个查询的值k，求出按照这个方式列举的的数中第k大的值v。
 */
public class PinDuoDuo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        long left = 1;
        long right = n*m;
        k = n*m-k+1;
        while (left<right){
            long mid = (left+right)/2;
            long cnt = 0;
            for (int i = 1;i<=n;i++){
                cnt +=Math.min(m,mid/i);
            }
            if (cnt>=k) right = mid;
            else left = mid+1;

        }
        System.out.println(left);

    }
}
