package offer;

public class Offer_30 {
    public int FindGreatestSumOfSubArray(int[] array) {
int sum=0;
int max=array[0];
for(int i=0;i<array.length;i++){
    sum+=array[i];
    max=Math.max(max,sum);
    if (sum<0){
        sum=0;
    }

}
        return  max;
    }
}
