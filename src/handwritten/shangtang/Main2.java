package handwritten.shangtang;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int G=0,o=0,d=0,count=0;
        int n=s.length();
        for (int i = 0; i <n ; i++) {
            char temp=s.charAt(i);
            if (temp=='G')G++;
            else if (temp=='o')o++;
            else if (temp=='d')d++;
            else continue;
            if (G==0){
             o=0;
             d=0;
            }else if (o==0)d=0;
            else if (d==0)continue;
            else {
                int num=Math.min(o/2,Math.min(G,d));
                count+=num;
                G-=num;
                o-=num*2;
                d-=num;
                if (G==0){
                    o=0;
                    d=0;
                }
                else if (o==0)d=0;
            }
        }
        System.out.println(count);
        }



}
