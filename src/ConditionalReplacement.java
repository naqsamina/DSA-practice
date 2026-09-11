package src;

public class ConditionalReplacement {
    public static String replaceB(String str,char B){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==B){
                sb.append("@");
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Hey! how are you?";
        char B = 'o';
        System.out.println(replaceB(str,B));

    }
}
