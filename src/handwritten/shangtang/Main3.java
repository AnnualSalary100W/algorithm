package handwritten.shangtang;
import java.util.*;
public class Main3 {



    public class Solution {
        /**
         *
         * @param intervals int整型二维数组
         * @return int整型
         */
        public int eraseOverlapIntervals (int[][] intervals) {
            // write code here
            int count=0;

            Arrays.sort(intervals,new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1]-o2[1];
                }
            });


            int end=Integer.MIN_VALUE;
            for (int i = 0; i <intervals.length ; i++) {
                if (end<=intervals[i][0]){
                    end=intervals[i][1];
                    count++;
                }
            }
            return intervals.length-count;
        }
    }
}
