package src.intermediate;

public class TimeToEquality {
    public static int equalElements(int [] A){

        int max = Integer.MIN_VALUE;
        int sec =0;
        for(int i =0;i<A.length;i++){
           if(A[i]>max){
               max = A[i];
           }
        }
        for(int i =0;i<A.length;i++){
            sec = sec + (max-A[i]);
        }
        return  sec ;

    }
    public static void main(String[] args) {
        int[] A = { 2,5,3,4,7,6};
        System.out.println(equalElements(A));


    }
}
