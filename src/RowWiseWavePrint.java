package src;
import java.util.Scanner;

public class RowWiseWavePrint {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int N =sc.nextInt();
      int M =sc.nextInt();
      int[][] mat = new int[N][M];
      for(int i =0;i<N;i++){
          for(int j =0;j<M;j++){
              mat[i][j] = sc.nextInt();
          }
      }
      for(int i=0;i<N;i++){
          if(i%2==0){
          for(int j =0;j<M;j++) {
              System.out.print(mat[i][j]);
          }
          }else{
              for(int j=mat[0].length-1;j>=0;j--){
                  System.out.print(mat[i][j]);


              }
          }

      }

    }
}
