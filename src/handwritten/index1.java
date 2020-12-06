package handwritten;

public class index1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,8,10,6,2,3};
        System.out.println(maxMinus(arr));
    }
    public static int maxMinus (int[] numbers) {
        if(numbers == null && numbers.length < 2)
            return 0;
        int max = numbers[0];
        int maxDiff =  max - numbers[1];

        for(int i = 2; i < numbers.length; ++i)
        {
            if(numbers[i - 1] > max)
                max = numbers[i - 1];
            int currentDiff = max - numbers[i];
            if(currentDiff > maxDiff)
                maxDiff = currentDiff;
        }
        return maxDiff;
    }
}
