package src;

public class lowerCaseLetters {
    public static String lowerCase(String A){
        StringBuilder st = new StringBuilder();
        for(int i =0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch>='a' && ch<='z'){
                st.append(ch);
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String A = "HeY Let's HaVe cuP of CofFee";
        System.out.println(lowerCase(A));

    }
}
