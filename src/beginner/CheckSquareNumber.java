package src;
import  java.util.Scanner;
public class CheckSquareNumber {
    public static int checkSquare(int A){
        for(int i =0;i<=A;i++){
            if(i*i==A){
                return  1;
            }
        }
        return  0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(checkSquare(A));
    }
}
