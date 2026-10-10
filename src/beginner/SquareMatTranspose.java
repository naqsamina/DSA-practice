package src;

import java.util.Arrays;

public class SquareMatTranspose {
    public static int [][] transposeMat(int[][] mat){
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<i;j++){
                int temp =mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat = {{2,4,5,3},
                       {3,4,2,6},
                       {4,4,2,5},
                       {4,6,2,5}};
        System.out.print(Arrays.deepToString(transposeMat(mat)));
    }
}
