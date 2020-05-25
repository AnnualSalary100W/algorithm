package offer;
/*
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
输入一个数组,求出这个数组中的逆序对的总数P。
并将P对1000000007取模的结果输出。即输出P%1000000007
 */
public class Offer_35 {
    public static void main(String[] args) {
        int[] array =new int[]{364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        System.out.println(new Offer_35().InversePairs(array));

    }
    private long sum;
    public  int InversePairs(int [] array) {
        sum =0;
          int l=0;
        int r=array.length-1;
        divide(l,r,array);
        return (int) (sum % 1000000007);
    }

    private void divide(int l, int r, int[] array) {
        if (l!=r){
            int mid=(l+r)>>1;
            divide(l,mid,array);
            divide(mid+1,r,array);
            merge(l,r,mid,array);
        }
    }

    private void merge(int l, int r, int mid, int[] array) {
        int i=l;//左区间的起点
        int j=mid+1;//右区间的起点
        int[] temp=new int[r-l+1];
        int index=0;
        while (i<=mid&&j<=r){
            if (array[i]>array[j]){
                temp[index++]=array[j++];
                sum+=mid-i+1;//去统计逆序对个数，基于归并排序
            }else {
                temp[index++]=array[i++];
            }
        }
        while (i<=mid){
            temp[index++]=array[i++];
        }
        while (j<=r){
            temp[index++]=array[j++];
        }
        index=0;
        for (int k=l;k<=r;k++){
array[k]=temp[index++];
        }


    }
}
