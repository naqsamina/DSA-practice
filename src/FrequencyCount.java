package src;

import java.util.Arrays;

public class FrequencyCount {
    public static int[] frequencyCount(int[] A){
        int[] res = new int[A.length];

        for(int i =0;i<A.length;i++){
            int count = 0;
            for(int j =0;j<A.length;j++){
                if(A[i]==A[j]){
                    count++;
                }
            }
            A[i] =count;

        }
        return  A;

    }

    public static void main(String[] args) {
        int[] A = {2,5,3,5,8,6,4,3,3};
        System.out.println(Arrays.toString(frequencyCount(A)));


    }
}
