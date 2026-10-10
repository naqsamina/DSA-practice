package src.intermediate;

public class CountOfPairsAg {
    public static int countOfAg(String Str){
        int countOfA = 0;
        int ans = 0;
        for (int i =0;i<Str.length();i++){
            if(Str.charAt(i)=='a'){
                countOfA++;
            }
            if(Str.charAt(i)=='g'){
                ans =ans+countOfA;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
         String str = "abtdgaagga";
        System.out.println(countOfAg(str));
    }
}
