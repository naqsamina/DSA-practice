package src;

import java.util.Scanner;

public class PrintReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
