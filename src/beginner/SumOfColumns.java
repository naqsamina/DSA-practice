package src;

import java.util.Arrays;

public class SumOfColumns {
    public static int[] sumOfCol(int[][] mat){
        int[] res = new int[mat[0].length];
        for(int j =0;j<mat[0].length;j++){
            int sum =0;
            for(int i =0;i<mat.length;i++){
                sum = sum +mat[i][j];
            }
            res[j] = sum;
        }
        return res;

    }

    public static void main(String[] args) {
        int[][] mat = {{2,4,6,3},
                       {6,4,6,3},
                       {4,7,3,5}};
        System.out.println(Arrays.toString(sumOfCol(mat)));

    }
}
