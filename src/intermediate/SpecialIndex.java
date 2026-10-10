package src.intermediate;

public class SpecialIndex {
    public static int[] prefixSum(int[] A){
        int[] evenSum = new int[A.length];
        evenSum[0] = A[0];

        for(int i =1;i<A.length;i++){
           if(i%2==0) {
               evenSum[i] = evenSum[i-1] + A[i];
           }
               else{
                   evenSum[i] = evenSum[i-1];
               }
           }
        return evenSum;

    }
    public static int[] prefixOdd(int[] A) {
        int[] oddSum = new int[A.length];

        for(int i =1;i<A.length;i++){
            if(i%2!=0){
                oddSum[i] = oddSum[i-1] + A[i];
                }else{
                    oddSum[i] = oddSum[i-1];
                }
        }
        return oddSum;
    }
    public static int specialIndex(int[] A){
        int[] evenSum = prefixSum(A);
        int[] oddSum = prefixOdd(A);
        int ans = 0;
        for(int i =0;i<A.length;i++){
            int es = 0;
            int os =0;
           if(i==0){
               es = oddSum[A.length-1]-oddSum[0];
               os = evenSum[A.length-1]-evenSum[0];
           }else{
               os = oddSum[i-1] +evenSum[A.length-1]-evenSum[i];
               es = evenSum[i-1]+ oddSum[A.length-1] -oddSum[i];
           }
           if(os == es){
               ans++;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = { 2,5,8,5,3,5,8,9,7,2};
        System.out.println(specialIndex(A));

    }
}
