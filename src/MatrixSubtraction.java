package src;

import java.util.Arrays;

public class MatrixSubtraction {
    public static int[][] subtractMatrix(int[][]A, int[][] B){
        int[][] res = new int[A.length][A[0].length];
        for(int i =0;i<A.length;i++){
            for(int j =0;j<A[0].length;j++){
                res[i][j]=B[i][j]-A[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] A = {{4,7,3,5},
                     {5,2,5,7},
                     {5,7,2,5}};
        int[][] B = {{8,4,7,2},
                     {5,9,2,6},
                     {8,6,3,8}};
        System.out.println(Arrays.deepToString(subtractMatrix(A,B)));
    }
}
