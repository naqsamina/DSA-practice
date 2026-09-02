package src;
import java.util.Scanner;

public class CountOfDigits {
    public static int countOfDigits(int N){
        int count = 0;
        while(N>0){
            N =N/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(countOfDigits(N));

    }
}
