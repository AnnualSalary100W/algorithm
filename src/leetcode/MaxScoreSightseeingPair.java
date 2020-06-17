package leetcode;

public class MaxScoreSightseeingPair {
    public static void main(String[] args) {
        int[] A=new int[]{8,1,5,2,6};
        System.out.println(maxScoreSightseeingPair(A));
    }
    public  static int maxScoreSightseeingPair(int[] A) {
        int ans = 0, mx = A[0] ;
        for (int j = 1; j < A.length; ++j) {
            ans = Math.max(ans, mx + A[j] - j);
            // 边遍历边维护
            mx = Math.max(mx, A[j] + j);
        }
        return ans;
    }
}
