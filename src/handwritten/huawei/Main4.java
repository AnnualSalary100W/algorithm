package handwritten.huawei;


import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String s=sc.next();

        int[] nums=new int[n];
        String[] line=sc.nextLine().split(" ");
        for (int i = 0; i <n ; i++) {
            nums[Integer.parseInt(line[i])]++;
        }
        System.out.println(types(nums));
    }

    public static  long types(int[] nums){
        Arrays.sort(nums);
        if (nums[0]>1)return 0;
        long count=1;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]==0)break;
            int a=nums[i-1]*2;
            int b=nums[i];
            count=count*num(a-b+1,a)/num(1,b);
            count= (long) (count%(Math.pow(10,9)+7));
        }
        return count;
    }
    public static long num(int a,int b){
        long res=1;
        for (int i = a; i <=b ; i++) {
            res=res*i;
        }
        return  res;
    }
}
