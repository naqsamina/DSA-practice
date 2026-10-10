package src;

public class SumOfIthRow {
    public static int sumOfithRow(int[][] mat,int B){
        int sum =0;
        for (int j=0;j<mat[B].length;j++){
            sum =sum + mat[B][j];
        }
        return sum;

    }
    public static void main(String[] args) {
        int[][] mat = {{2,4,7,4},
                       {4,6,3,8},
                       {3,5,9,6}};
        int B =2;
        System.out.println(sumOfithRow(mat,B));
    }
}
