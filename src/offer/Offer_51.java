package offer;

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
