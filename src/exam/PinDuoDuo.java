package exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

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
