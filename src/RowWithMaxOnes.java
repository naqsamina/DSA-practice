package src;

import java.util.Arrays;

public class RowWithMaxOnes {
    public static int[] maxOnes(int[][] mat){
        int[] res = new int[2];
        int current = 0;
        int row =0;

        for(int i =0;i<mat.length;i++){
            int count =0;
            for(int j =0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
                if(count>current){
                    current=count;
                     row = i;
                }
            }
        }
        res[0] = row;
        res[1] = current;
        return res;
    }
    public static void main(String[] args) {
        int[][] mat = {{0,0,1,1,0},
                       {0,0,1,0,0},
                       {0,1,0,1,1}};
        System.out.println(Arrays.toString(maxOnes(mat)));
    }
}
