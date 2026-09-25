package src;

import java.util.Arrays;

public class ReverseArrayPart {
    private static void swapping(int[] A,int left,int right){
        int temp = A[left];
        A[left]=A[right];
        A[right] = temp;
    }
    public static int[] reverse(int[] A){
        int left = 2;
        int right = 8;
        while(left<right){
            swapping(A,left,right);
            left++;
            right--;

        }
        return A;

    }
    public static void main(String[] args) {
        int[] A = {2,45,7,3,7,8,8,5,4,3};
        System.out.println(Arrays.toString(reverse(A)));



    }
}
