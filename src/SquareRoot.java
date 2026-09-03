package src;
import java.util.Scanner;
public class SquareRoot {
     public static int squareRoot(int A){
         for (int i =1;i<A;i++){
             if(i*i==A){
                 return i;
             }
         }
         return -1;

    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
        System.out.println(squareRoot(A));
    }
}
