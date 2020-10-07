package leetcode;

public class SortColors75 {
    public void sortColors(int[] nums) {
        int len = nums.length,a = 0, b = 0 ,c = 0;
        for(int i = 0; i < len ; i++){
            if(nums[i] == 0){
                a++;
            }if (nums[i]==1){
                b++;
            }else{
                c++;
            }

        }
        for(int i = 0;i < len; i++){
            while(i < a){
                nums[i] = 0;
                break;
            }
            while(i >=a && i <a + b){
                nums[i] = 1;
                break;
            }
            while(i >= a + b && i < a + b + c){
                nums[i] = 2;
                break;
            }

        }
    }
}
