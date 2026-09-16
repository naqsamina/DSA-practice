package src;

import java.util.Arrays;

public class RotateMatrix {
    private static void transposeMat(int[][]mat){
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<i;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    private static void reverseArr(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
    }
    private static void reverseRow(int[][] mat){
        for(int i=0;i<mat.length;i++){
            reverseArr(mat[i]);
        }
    }
    public static int[][] matRotate(int[][] mat){
        transposeMat(mat);
        reverseRow(mat);
        return mat;

    }
    public static void main(String[] args) {
        int[][] mat = {{2,5,3,4,5},
                       {3,4,6,4,4},
                       {3,5,6,3,2},
                       {3,5,6,5,3},
                       {3,8,4,2,5}};
        System.out.println(Arrays.deepToString(matRotate(mat)));
    }
}
