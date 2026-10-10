package src;

public class PairCount {
    public static int pairCount(int[] A, int B){
        int count = 0;
        for(int i =0;i<A.length;i++){
            for(int j = i+1;j<A.length;j++){
                if(A[i]+A[j]==B){
                    count++;
                }

            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {5,5,3,6,7,7,5,4};
        int B = 10;
        System.out.println(pairCount(A,B));
    }
}
