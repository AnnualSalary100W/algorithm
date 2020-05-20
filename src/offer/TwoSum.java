package offer;

import java.util.*;


/**
 *
 *
 * 一个数组找两个数字和等于target
 */
public class TwoSum {



        public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            String line=sc.nextLine();
            int target=Integer.parseInt(line.split(" ")[1]);
            String[] strings =line.split(" ")[0].split(",");
            int[] nums=new int[strings.length];
            for(int i=0;i< nums.length;i++){
                nums[i]=Integer.parseInt(strings[i]);
            }
String result=Arrays.toString(method1( nums,target));
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





