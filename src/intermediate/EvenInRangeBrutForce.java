package src.intermediate;

import java.util.Arrays;

public class EvenInRangeBrutForce {
    public static int[] evenCount(int[] A, int[][] Q){
        int N = Q.length;
        int[] res = new int[N];
        for(int i =0;i<N;i++){
            int S = Q[i][0];
            int E = Q[i][1];
            int count=0;
           for(int j = S;j<=E;j++){
               if(A[j]%2==0){
                   count++;
               }
               res[i] = count;
           }

        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {3,5,8,5,4,3,6,7,4};
        int[][] Q = {{3,6},
                     {2,5},
                     {3,6}};
        System.out.println(Arrays.toString(evenCount(A,Q)));
    }
}
