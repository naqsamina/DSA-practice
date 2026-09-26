package src;

public class IdentityMatrix {
    public static int isDiagonalMat(int[][] mat){
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                if(i==j&&mat[i][j]!=1){
                    return 0;
                }if(i!=j&&mat[i][j]!=0){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,0,0,0},
                       {0,1,0,0},
                       {0,0,1,0},
                       {0,0,0,1}};
        System.out.println(isDiagonalMat(mat));
    }
}
