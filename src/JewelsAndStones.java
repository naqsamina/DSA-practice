package src;

public class JewelsAndStones {
    public static  int stoneAndJewels(String A,String B){
        int count = 0;
        for(int i =0;i<B.length();i++){
            char ch = B.charAt(i);
             for (int j =0;j<A.length();j++){
                 char ch1 = A.charAt(j);
                 if(ch==ch1){
                     count++;
                 }


             }
        }
        return count;

    }
    public static void main(String[] args) {
        String A = "hvidGUYs";
        String B = "HIVuvuhgyudeB";
        System.out.println(stoneAndJewels(A,B));

    }
}
