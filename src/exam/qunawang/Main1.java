package exam.qunawang;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long count = 1;
        if (n > m){
            System.out.println(0);
        }
        if (n==m){
            System.out.println(1);
        }
        for (int i = 0; i < n ; i++) {
            count = count * (m - i)/(1 + i);
        }
        System.out.println(count);
    }
}
