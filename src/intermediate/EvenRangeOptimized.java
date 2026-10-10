package src.intermediate;

import java.util.Arrays;

public class EvenRangeOptimized {
    public static int[] pCount(int[] A){
        int N =A.length;
        int[] pCount = new int[N];
        if(A[0]%2==0){
            pCount[0] = 1;
        }
        for(int i =1;i<A.length;i++){
            if(A[i]%2==0){
                pCount[i] = pCount[i-1]+1;
            }else{
                pCount[i] = pCount[i-1];
            }
        }
        return pCount;
    }
    public static int[] prefixCountOptimized(int[] A, int[][] Q){
        int[] res = new int[Q.length];
        int[] pCount = pCount(A);
        for (int i =0;i<Q.length;i++){
            int s = Q[i][0];
            int e = Q[i][1];
            if(s==0){
                res[i] = pCount[e];
            }
            else{
                res[i] = pCount[e] - pCount[s-1];
            }

        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {0,6,8,7,2,54,8,6,9,3,2,3};
        int[][] Q = {{1,8},
                     {4,8},
                     {2,4}};
        System.out.println(Arrays.toString(prefixCountOptimized(A,Q)));
    }
}
