package src;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int LCM =1;
        int max = Math.max(A,B);
        for(int i =max;i<=A*B;i++){
            if(i%A==0 &&i%B==0){
                LCM = i;
                break;
            }

        }
        System.out.println(LCM);
    }
}
