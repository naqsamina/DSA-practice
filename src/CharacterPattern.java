package src;

public class CharacterPattern {
    public static void Pattern(int N){
        for(int i = 0;i<=N;i++){
             char ch = 'A';
             for (int j =1;j<=i;j++){
                 System.out.print(ch + "_");
                 ch++;
             }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 5;
        Pattern(N);
    }
}
