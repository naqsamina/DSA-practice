package src;

public class AlphaNum {
    public static int solve(char[] A) {
        for(int i =0;i<A.length;i++){
            char ch = A[i];
            if(!(ch>='a' && ch<='z'|| ch>='A' && ch<='Z' || ch>='0' && ch<='9')){
                return 0;
            }
        }
        return 1;

    }


    public static void main(String[] args) {
        char[] A={'a','y','y','b','d','u', '$'};
        System.out.println(solve(A));

    }
}
