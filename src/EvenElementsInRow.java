package src;

import java.util.ArrayList;

public class EvenElementsInRow {
    public static ArrayList<ArrayList<Integer>> EvenElements(int[][] mat){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i =0;i<mat.length;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j =0;j<mat[0].length;j++){
                if(mat[i][j]%2==0){
                    row.add(mat[i][j]);
                }
            }
            res.add(row);
        }
        return  res;
    }
    public static void main(String[] args) {
        int[][] mat = {{2,3,4,6},
                       {4,5,3,5},
                       {4,6,3,6}};
        System.out.println(EvenElements(mat));
    }
}
