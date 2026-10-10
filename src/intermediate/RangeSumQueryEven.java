package src.intermediate;

import java.util.Arrays;

public class RangeSumQueryEven {
    public static int[] pSum(int[] A){
        int N = A.length;
        int[] pSum = new int[N];
        pSum[0] = A[0];
        for(int i =1;i<N;i++){
            if(i%2==0) {
                pSum[i] = pSum[i - 1] + A[i];
            }
            else{
                pSum[i] = pSum[i-1];
            }
        }
        return pSum;
    }
    public static int[] rangeSum(int[] A, int[][] Q){
        int N = Q.length;
        int[] ans = new int[N];
        int[] pSum = pSum(A);
        for(int i=0;i<Q.length;i++){
            int L = Q[i][0];
            int R = Q[i][1];
            if(L ==0){
                ans[i] = pSum[R];
            }else{
                ans[i] = pSum[R]-pSum[L-1];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] A = {3,6,3,2,5,6,4,3,6};
        int[][] Q = {{3,6},
                     {3,6,},
                     {4,8},
                     {3,8}};
        System.out.println(Arrays.toString(rangeSum(A,Q)));
    }
}
