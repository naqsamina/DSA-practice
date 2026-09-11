package src;

import java.util.ArrayList;

public class VowelsFromRow {
    public static boolean isVowel(char ch){
        String vowels = "aeiouAEIOU";
        return vowels.contains("" + ch);
    }
    public static ArrayList<ArrayList<Character>> VowelFromRow(ArrayList<String> A){
        ArrayList<ArrayList<Character>> res = new ArrayList<>();
        for(int i =0;i<A.size();i++){
            String str = A.get(i);
            ArrayList<Character> row = new ArrayList<>();
            for(int j =0;j<str.length();j++){
                char ch = str.charAt(j);
                if(isVowel(ch)){
                    row.add(ch);
                }
            }
            res.add(row);
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("SunFlower");
        A.add("Rose");
        A.add("Lily");
        A.add("Lotus");
        System.out.println(VowelFromRow(A));


    }
}
