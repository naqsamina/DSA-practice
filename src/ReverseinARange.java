package src;
import java.util.Arrays;

public class ReverseinARange {
    public static int[] reverseAnArray(int[] arr, int B, int C){
        int left = B;
        int right = C;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            right--;
            left++;
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {3,6,3,5,2,3,5,6};
        int B =5;
        int C = 6;
        System.out.println(Arrays.toString(reverseAnArray(arr,B,C)));
    }
}
