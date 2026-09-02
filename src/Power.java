package src;

public class Power {
    public static int power(int A, int B){
        int answer=1;
        for(int i =0;i<B;i++){
            answer = answer * A;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(power(5,3));

    }

}

