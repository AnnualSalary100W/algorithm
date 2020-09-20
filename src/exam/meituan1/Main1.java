package exam.meituan1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int count =  0;
        for (int i = M; i <= N ; i++) {
            int A = i/100000;
            int B = (i-(A*100000))/10000;
            int C = (i-(A*100000)-(B*10000))/1000;
            int D = (i-(A*100000)-(B*10000)-(C*1000))/100;
            int E =(i-(A*100000)-(B*10000)-(C*1000)-(D*100))/10;
            int F=(i-(A*100000)-(B*10000)-(C*1000)-(D*100)-(E*10));
            if(A != B && A != C && A != D && A != E && A != F && B != C && B != D &&
               B != E && B != F && C != D && C != E && C != F && D != E && D != F && E != F && ((A*10+B+C*10+D)==(E*10+F))){
                count++;
            }

        }
        System.out.println(count);
    }
}
