package src;

public class OddEvenSum {
    public static void sumOfOddEven(int num){
        int oddSum=0;
        int evenSum=0;
        while(num>0){
            int digit = num%10;
            if(digit%2==0){
                evenSum=evenSum+digit;
            }else{
                oddSum = oddSum+digit;
            }
            num = num/10;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
    public static void main(String[] args) {
        int num =24542234;
        sumOfOddEven(num);

    }
}
