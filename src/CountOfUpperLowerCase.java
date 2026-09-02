package src;
import  java.util.Scanner;

    public class CountOfUpperLowerCase {
    public static void countUpperLower(String st){
        int UpperCount = 0;
        int LowerCount = 0;
        for(int i =0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch>='a'&& ch<='z'){
                LowerCount++;

            }if(ch>='A' && ch<='Z'){
                UpperCount++;
            }
        }
        System.out.println(UpperCount);
        System.out.println(LowerCount);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        countUpperLower(st);

    }
}
