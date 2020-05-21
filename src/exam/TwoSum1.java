package exam;

import java.util.*;


/**
 *
 *
 * 一个数组找两个数字和等于target
 */
public class TwoSum1{



    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            //获取输入的整数序列
            String str = sc.nextLine();
            String[] strings = str.split(" ")[0].split(",");
            int target=Integer.parseInt(str.split(" ")[1]);
            //转为整数数组
            int[] ints = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                ints[i] = Integer.parseInt(strings[i]);
        }
        String result=Arrays.toString(method1( ints,target));
        System.out.println(result);
    }

    public  static int[] method1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{i, j};

                }
            }
        }
        return null;
    }
}

