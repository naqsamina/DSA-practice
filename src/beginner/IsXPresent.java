package src;

public class IsXPresent {
    public static int isXPresent(int[] A, int B){
        for(int i =0;i<A.length;i++){
            if(B==A[i]){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {2,5,7,2,3,4,5,6};
        int B = 9;
        System.out.println(isXPresent(A,B));

    }
}
