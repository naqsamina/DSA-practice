package src;

public class SumOfEvens {
    public static int sumOfEven(int A){
        int sum = 0;
        for(int i =1;i<=A;i++){
            if(i%2==0){
                sum = sum+i;

            }

        }
        return  sum;
    }
    public static void main(String[] args) {
        int A = 34;
        System.out.println(sumOfEven(A));
    }
}
