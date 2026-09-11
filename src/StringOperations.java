package src;

public class StringOperations {
    private static String concatenate(String str){
        String res = str+str;
        return res;
    }
    private static String deleteUpperCase(String res){
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<res.length();i++){
            char ch = res.charAt(i);
            if(ch>='A' && ch<='Z'){
                    continue;
            }
            if(ch=='a' || ch =='e' || ch =='i'|| ch=='o' || ch=='u'){
                sb.append('#');
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();

    }
    public static String operateString(String str){
        String res = concatenate(str);
        res = deleteUpperCase(str);

return res;

    }

    public static void main(String[] args) {
        String str = "I love java!";
        System.out.println(operateString(str));
    }
}
