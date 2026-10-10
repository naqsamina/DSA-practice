package src;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transposeMat(int[][] mat){
        int N = mat.length;
        int M = mat[0].length;
        int[][] res = new int[M][N];
        for(int i =0;i<M;i++){
            for(int j =0;j<N;j++){
                res[i][j] =mat[j][i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                       {2,3,7,4},
                       {6,3,8,4}};

        System.out.println(Arrays.deepToString(transposeMat(mat)));
    }
}
