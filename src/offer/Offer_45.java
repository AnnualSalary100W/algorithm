package offer;

import java.util.Arrays;

public class Offer_45 {
    public static void main(String[] args) {
        int[] arr=new int[]{2,0,3,4,7};
        System.out.println(isContinuous(arr));
    }
    public static boolean isContinuous(int [] numbers) {
        int numOfZero = 0;
    int numOfInterval = 0;
    int length = numbers.length;
        if(length == 0){
        return false;
    }
        Arrays.sort(numbers);
        for (int i = 0; i < length - 1; i++) {
        // 计算癞子数量
        if (numbers[i] == 0) {
            numOfZero++;
            continue;
        }
        // 对子，直接返回
        if (numbers[i] == numbers[i + 1]) {
            return false;
        }
        numOfInterval += numbers[i + 1] - numbers[i] - 1;
    }
        if (numOfZero >= numOfInterval) {
        return true;
    }
        return false;
}
    }

   /* if (numbers[2]==0){
        if (numbers[4]-numbers[3]>4){
            return false;
        }
    }
    if (numbers[1]==0){
        if (numbers[3]-numbers[2]>3&&numbers[4]-numbers[3]>3){
            return false;
        }
    }
    if (numbers[0]==0){
        if (numbers[2]-numbers[1]>2&&numbers[3]-numbers[2]>2&&numbers[4]-numbers[3]>2){
            return false;
        }
    }
*/








