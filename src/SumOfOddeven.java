package src;

public class SumOfOddeven {
    public static void sumOfOddAndEven(int N){
        int evenSum =0;
        int oddSum =0;
        while (N>0){
            int digit = N%10;
            if(digit%2==0){
                evenSum=evenSum+digit;
            }
            else{
                oddSum=oddSum+digit;
            }
            N = N/10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
    public static void main(String[] args) {
        int N = 23553;
        sumOfOddAndEven(N);
    }
}
