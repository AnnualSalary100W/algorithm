package offer;
/*
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
不能使用除法。
（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 */
public class Offer_51 {
    public static void main(String[] args) {
        int[] A =new int[]{0,0,40,0,0};
        System.out.println(multiply(A));
    }
    public  static  int[] multiply(int[] A) {
        int n=A.length;
        int[] B=new int[n];
        for(int k=0;k<n;k++){
            B[k]=1;
            for (int j=0;j<n;j++){
                if (k==j){
                    continue;
                }
                    B[k]=B[k]*A[j];

            }


        }
return B;
}
}
