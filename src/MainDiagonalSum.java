package src;

public class MainDiagonalSum {
    public static int diagonalSum(int[][] A){
        int sum =0;
        for(int i =0;i<A.length;i++){
            for(int j =0;j<A[0].length;j++){
                if(i==j){
                    sum = sum +A[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] A = {{2,4,6,4},
                     {4,7,4,3},
                     {4,5,3,6},
                     {2,4,6,7}};
        System.out.println(diagonalSum(A));


    }
}
