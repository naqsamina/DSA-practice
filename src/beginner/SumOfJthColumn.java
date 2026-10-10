package src;

public class SumOfJthColumn {
    public static int sumOfJthColumn(int[][]mat ,int B){
        int sum =0;
        for(int i =0;i<mat.length;i++){
            sum = sum +mat[i][B];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] mat = {{2,5,7,8},
                       {4,5,3,7},
                       {3,5,6,7}};
        int B =2;
        System.out.println(sumOfJthColumn(mat,B));

    }
}
