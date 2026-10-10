package src;

import java.util.Arrays;

public class RowColumnSum {
    public  static int[] RowColumSum(int[][] A){
        int colSum=0;
        int rowSum = 0;
        int[] res = new int[A.length+A[0].length];
        int k =0;
        for(int i =0;i<A.length;i++){
            for(int j =0;j<A[0].length;j++){
                rowSum=rowSum+A[i][j];
            }
            res[k] = rowSum;
            k++;

        }
        for(int j =0;j<A[0].length;j++){
            for(int i =0;i<A.length;i++){
                colSum=colSum+A[i][j];
            }
            res[k]=colSum;
            k++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] A = {{2,5,3,6,7},
                     {4,6,7,3,5},
                     {5,7,4,3,5}};
        System.out.println(Arrays.toString(RowColumSum(A)));
    }
}
