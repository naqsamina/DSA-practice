package src;

import java.util.Scanner;

public class FactorialOfANumber {
    public static int factorial(int N){
        int fact = 1;
        for(int i =1;i<=N;i++){
            fact =fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));

    }
}
