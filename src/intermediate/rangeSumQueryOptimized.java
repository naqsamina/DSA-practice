package src.intermediate;

import java.util.Arrays;

public class rangeSumQueryOptimized {
    public static int[] pSum(int[] A){

        int[] pSum = new int[A.length];
        pSum[0] = A[0];
        for(int i =1;i<A.length;i++){
                pSum[i] = pSum[i-1]+A[i];
            }
        return pSum;
    }

    public static int[] rangeSum(int[] A , int[][] Q){
        int N = Q.length;
        int[] ans = new int[N];
        int[] pSum = pSum(A);
        for(int i =0;i<Q.length;i++){
            int L = Q[i][0];
            int R = Q[i][1];
            if(L==0){
                ans[i]=pSum[R];
            }else{
                 ans[i] = pSum[R]-pSum[L-1];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] A = {2,6,7,4,2,5,8,6,3};
        int[][] Q = {{2,6},
                     {3,6},
                     {2,7},
                     {3,4}};
        System.out.println(Arrays.toString(rangeSum(A,Q)));
    }
}
