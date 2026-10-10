package src;

import java.util.Scanner;

public class MaxElementInMatrix {
    public static int max(int[][] mat, int N ,int M){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<N;i++) {
            for(int j =0;j<M;j++){
                if(mat[i][j]>max){
                    max = mat[i][j];

                }
            }

        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 3;
        int M = 4;
        int[][] mat = new int[N][M];
        for(int i =0;i<N;i++){
            for(int j =0;j<M;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(max(mat, N, M));
    }
}
