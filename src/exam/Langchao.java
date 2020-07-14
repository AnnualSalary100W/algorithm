package exam;

import java.util.*;

public class Langchao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        int[] numssort = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        numssort = nums.clone();
        Arrays.sort(numssort);
        int count = 0;
        for (int j = 0; j < len; j++) {
            if (nums[j] != numssort[j])
                count++;
        }
        System.out.println(count);
    }
}





