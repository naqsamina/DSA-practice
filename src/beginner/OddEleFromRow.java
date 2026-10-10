package src;

import java.util.ArrayList;

public class OddEleFromRow {
    public static ArrayList<ArrayList<Integer>> oddElements(int[][] mat){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]%2!=0){
                    row.add(mat[i][j]);
                }
            }
            res.add(row);
        }
        return  res;
    }
    public static void main(String[] args) {
        int[][]  mat = {{2,4,6,7},
                        {4,6,3,8},
                        {3,8,4,7}};
        System.out.println(oddElements(mat));
    }
}
