package src;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinElement {
    public static int[] MaxAndMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] res = new int[2];
        for(int i =0;i< arr.length;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        res[0]=max;
        res[1]=min;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i =0;i<N;i++){
            arr[i] = sc.nextInt() ;
        }
        System.out.println(Arrays.toString(MaxAndMin(arr)));
    }
}
