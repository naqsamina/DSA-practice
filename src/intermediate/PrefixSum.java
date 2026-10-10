package src.intermediate;

import java.util.Arrays;

public class PrefixSum {
    public static int[] prefixSum(int[] A ){
        int N = A.length;
        int[] pSum = new int[N];
        pSum[0] = A[0];
        for(int i =1;i<N;i++){
            pSum[i]=(pSum[i-1])+A[i];
        }
        return pSum;
    }
    public static void main(String[] args) {
        int[] A = {4,7,5,3,2,5,7,9,9};
        System.out.println(Arrays.toString(prefixSum(A)));

    }
}
