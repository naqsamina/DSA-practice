package src;

public class MaxOfJthColumn {
    public static int maxOfBthCol(int[][] mat,int B){
        int max =Integer.MIN_VALUE;
        for(int j =0;j<mat[B].length;j++){
            for(int i =0;i<mat.length;i++){
                if(mat[i][B]>max){
                    max = mat[i][B];
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[][] mat = {{2,4,6,8},
                       {9,4,6,7},
                       {3,5,6,4}};
        int B =0;
        System.out.println(maxOfBthCol(mat,B));
    }
}
