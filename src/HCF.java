package src;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hcf =1;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int min = Math.min(A,B);
        for(int i =1;i<=min;i++){
            if(A%i==0 && B%i==0){
                 hcf =i;
            }
        }
        System.out.println(hcf);
    }
}
