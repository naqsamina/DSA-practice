package src.intermediate;

public class RowWiseSum {
    public static void sum(int[][] mat){
        for(int i =0;i<mat.length;i++){
            int sum =0;
            for(int j =0;j<mat[0].length;j++){
                sum = sum + mat[i][j];
            }
            System.out.println(sum);
        }

    }
    public static void main(String[] args) {
        int[][] mat = {{2,5,7,3},
                       {3,6,4,2},
                       {5,8,4,2}};
        sum(mat);


    }
}
