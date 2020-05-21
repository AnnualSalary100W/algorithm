package exam;

import java.util.Scanner;

public class ContinuousStringMaximum {
    public static int getTargetMax(int[] arr) {
        int max = arr[0];
        int tmpMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (tmpMax <= 0)
                tmpMax = arr[i];
            else
                tmpMax += arr[i];
            if (tmpMax > max) {
                max = tmpMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //获取输入的整数序列
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        //转为整数数组
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(getTargetMax(ints));
    }




}
