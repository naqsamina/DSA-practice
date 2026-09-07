package src;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transposeMat(int[][] mat){
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                       {2,3,7,4},
                       {6,3,8,4},
                       {1,4,7,5}};
        System.out.println(Arrays.deepToString(transposeMat(mat)));
    }
}
