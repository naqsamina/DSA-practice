package src;

public class LengthOfLongestWord {
    public static int lengthOfLongest(String str){
        int current = 0;
        int count=0;
        for(int i =0;i<str.length();i++){
            int ele = str.charAt(i);
            if(ele!=' '){
                count++;
            }else {
                if(count>current){
                    current=count;
                    count=0;
                }
            }
        }
        return current;
    }
    public static void main(String[] args) {
     String str  = "Hey Samina this side!";
        System.out.println(lengthOfLongest(str));

    }
}
