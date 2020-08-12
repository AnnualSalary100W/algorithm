package exam;

import java.util.Scanner;

public class Beike1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] data=new int[n];
        for (int i = 0; i <n ; i++) {
            data[i]=sc.nextInt();

        }
        System.out.println(three(n,data));
    }

    public static int three(int n,int[] nums){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <=i ; j++) {
                int left=j;
                int right=i;
                int cur=nums[left];
                while (left<=right){
                    cur=cur|nums[left++];
                }
                int curlen=i-j+1;
                if (cur>max||cur==max&&curlen<min){
                    max=cur;
                    min=curlen;
                }
            }
        }
        return min;
    }
}
