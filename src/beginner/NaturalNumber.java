package src;

import java.util.Arrays;
import java.util.Scanner;

public class NaturalNumber {
    public static  int[] naturalNum(int A){
        int[] arr = new int[A];
        for(int i =0;i<arr.length;i++){
            arr[i] = i+1;

        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(Arrays.toString(naturalNum(A)));

    }
}
