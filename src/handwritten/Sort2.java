package handwritten;

public class Sort2 {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3};
        sort(arr,0,arr.length-1);
        for (int i = 0; i <5 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public  static  void  sort(int[] a, int low,int high){
        int start = low;
        int end   = high;
        int key   = a[start];

        while (start<end){
            while (start<end && a[end] >= key) end--;
            if (a[end] < key){
                int tem = a[start];
                a[start] = a[end];
                a[end] = tem;
            }
            while (start<end && a[start] <= key) start++;
            if (a[start] > key){
                int tem = a[start];
                a[start] = a[end];
                a[end]= tem;
            }
        }
        if (start>low) sort(a,low,start-1);
        if (end<high) sort(a,end+1,high);
    }
}
