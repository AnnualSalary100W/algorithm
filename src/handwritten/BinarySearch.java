package handwritten;
/*
二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
               int[] arr=new int[]{1,2,3,4,5,8,9,45,80};
               int key =45;
        System.out.println(BinarySearch(arr,key));
    }
    public static int BinarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        if (low>high||key<arr[low]||key>arr[high]){
            return -1;
        }
        while (low<high){
            int middle=low+(high-low)/2;
            if (arr[middle]>key){
                high=middle-1;
            }else if (arr[middle]<key){
                low=middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
