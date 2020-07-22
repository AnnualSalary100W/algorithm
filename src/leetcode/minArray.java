package leetcode;
/*
剑指 Offer 11. 旋转数组的最小数字
 */
public class minArray {
    public static void main(String[] args) {
        int[] numbers=new int[]{1};
        System.out.println(minArray(numbers));
    }
    public  static int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
