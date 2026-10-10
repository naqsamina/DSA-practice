package src;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftEleLeft {
    public static int[] shiftElement(int[]arr){
        int temp = arr[0];
        for(int i =0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] arr = new int[N];
        for(int i =0;i<N;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(shiftElement(arr)));
    }
}
