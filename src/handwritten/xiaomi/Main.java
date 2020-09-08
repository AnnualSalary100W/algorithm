package handwritten.xiaomi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] code=sc.nextLine().split(" ");
        for(String s:code){
            System.out.println(bingo(s));
        }
    }
    public  static int bingo(String s){
        int n=s.length();
        boolean digit=false;
        boolean a=false;
        boolean upper=false;
        boolean lower=false;
        for (int i = 0; i < s.length(); i++) {
            char tmp=s.charAt(i);
            if (Character.isDigit(tmp))digit=true;
            else if (Character.isUpperCase(tmp))upper=true;
            else if (Character.isLowerCase(tmp))lower=true;
            else a=true;
        }
        if (digit&&upper&&lower&&n>=8&&n<=120)return 0;
        else if (n>=8&&n<=120)return 2;
        else return 1;
    }
}
