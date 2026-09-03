package src;

import java.util.Arrays;

public class CountOfVowelsConsonants {
    public static int[] countOfVowels(String A){
        int vowels =0;
        int consonants = 0;
        int[] arr = new int[2];

        for(int i =0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch=='a' || ch =='e' || ch=='i' || ch =='o' || ch == 'u'){
                vowels++;

            }else{
                consonants++;
            }
            arr[0] = vowels;
            arr[1] = consonants;


        }
       return arr;
    }
    public static void main(String[] args) {
        String A = "Hey i am Samina";
        System.out.println(Arrays.toString(countOfVowels(A)));


    }
}
