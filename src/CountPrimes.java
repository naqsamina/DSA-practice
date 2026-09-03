package src;

public class CountPrimes {
        public static int solve(int A) {
            int count =0;
            for(int i =2;i<=A;i++){
                int factors = 0;
                for(int j =1;j<=i;j++){
                    if(i%j==0){
                        factors++;
                    }

                }
                if(factors==2){
                    count++;
                }
            }
            return count;
        }
    public static void main(String[] args) {
        System.out.println(solve(10));

    }
    }



