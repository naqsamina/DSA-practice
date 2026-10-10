package src.intermediate;

import java.util.Arrays;

public class NobleElements {
    public static int nobleElements(int[] A){
        int count =0;
        Arrays.sort(A);
        for(int i =0;i<A.length;i++){
            if(A[i]==i){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {3,6,3,2,4,6,75,3,23};
//                {2,3,3,3,4,6,6,23,75
        System.out.println(nobleElements(A));
    }
}
