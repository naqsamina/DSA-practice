package src;

public class LengthOfLongestWord {
    public static int lengthOfLongest(String str){
        int current =0;
        int length =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                length++;
            }else{
                if(length>current){
                    current=length;
                }
                length=0;
            }
        }
        return current;
    }
    public static void main(String[] args) {
        String str = "Hey! What's going on ?";
        System.out.println(lengthOfLongest(str));

    }
}
