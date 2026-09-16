package src;

public class UniqueOccurrenceCount {
    public static int uniqueEleCount(int[] A){

        int count =0;

        for(int i =0;i<A.length;i++){

            int frequency =0;

            for(int j =0;j<A.length;j++){
                if(A[i] == A[j]){
                    frequency++;
                }

            }
            if(frequency==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {2,7,4,4,6,27,8,7,4};
        System.out.println(uniqueEleCount(A));

    }
}
