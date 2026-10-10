package src.intermediate;

import java.util.Arrays;

public class RangeSumQuery {
    public static int[] rangeSum(int[] A, int[][] Q){
        int N = Q.length;
        int[] res= new int[N];
        for(int i =0;i<N;i++){
            int L = Q[i][0];
            int R = Q[i][1];
            int sum =0;
              for(int j=L;j<=R;j++){
                  sum = sum + A[j];
              }
            res[i] = sum;

        }return res;
    }
    public static void main(String[] args) {
        int[] A = { 2,4,6,3,5,7,8,5,3,3};
        int[][] Q = {{2,6},
                     {3,4},
                     {3,8}};
        System.out.println(Arrays.toString(rangeSum(A,Q)));
    }
}
