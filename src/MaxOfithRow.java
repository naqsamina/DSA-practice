package src;

public class MaxOfithRow {
    public static int maxInIthRow(int[][]mat, int B){
        int max = Integer.MIN_VALUE;
        for(int j=0;j<mat[B].length;j++){
            if(mat[B][j]>max){
                max = mat[B][j];
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int[][] mat = {{2,4,3,5},
                       {3,4,3,5},
                       {4,3,4,6}};
        int B = 1;
        System.out.println(maxInIthRow(mat,B));
    }
}
