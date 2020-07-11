package leetcode;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountSmaller315 {
    public List<Integer> countSmaller(int[] nums) {
        if(nums == null || nums.length == 0) return new LinkedList<>();
        //使用链表头插法
        LinkedList<Integer> res = new LinkedList<>();
        int len = nums.length;
        //反向插入排序
        for(int i = len - 2; i >= 0; i--){
            int j = i + 1, temp = nums[i];
            while(j < len && nums[j] >= temp){
                nums[j - 1] = nums[j];
                j++;
            }
            nums[j - 1] = temp;
            //len - j就表示计数个数
            res.addFirst(len - j);
        }
        //添加最后一个数
        res.add(0);
        //LinkedList也是List
        return res;

    }
}
