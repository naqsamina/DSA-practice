package src;

public class MaxProduct {
    public static int maxProduct(int[] A){
        int maxProduct = Integer.MIN_VALUE;
        for(int  i =0;i<A.length;i++){
            for(int j =0;j<i;j++){
                if(A[i]*A[j]>maxProduct){
                    maxProduct=A[i]*A[j];
                }
            }
        }
        return maxProduct;
    }
    public static void main(String[] args) {
            int[] A = {3,5,3,1,4,6,7,9};
        System.out.println(maxProduct(A));
    }
}
