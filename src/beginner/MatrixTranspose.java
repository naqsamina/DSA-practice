package src;

import java.util.Scanner;
import java.util.Arrays;

public class MatrixTranspose {
    public static int[][] transposeOfMatrix(int[][]mat, int N, int M ){

        int[][] res = new int[M][N];
        for(int i =0;i<M;i++){
            for(int j =0;j<N;j++){
               res[i][j]= mat[j][i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] mat = new int[N][M];
        for(int i =0;i<N;i++){
            for(int j =0;j<M;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(transposeOfMatrix(mat,N,M)));

    }
}
