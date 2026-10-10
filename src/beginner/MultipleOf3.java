package src;

import java.util.Arrays;
//import java.util.Collections;

public class MultipleOf3 {
    public static int[] multipleOf3(int[] A){
        int count =0;
        for(int i =0;i<A.length;i++){
            if(A[i]%3==0){
                count++;
            }
        }
        int[] res = new int[count];
        int index =0;
        for(int i =0;i<A.length;i++){
            if(A[i]%3==0){
                res[index] = A[i];
                index++;
            }
        }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args) {
        int[] A = {3,6,4,87,9,4,34,53,27};
        System.out.println(Arrays.toString(multipleOf3(A)));
    }
}
