package src.beginner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class AllEvenNumbers {
    public static ArrayList<Integer> evenNumbers(ArrayList<Integer> Al){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<Al.size();i++){
            int ele = Al.get(i);
            if(ele%2==0){
                res.add(ele);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        ArrayList<Integer> Al = new ArrayList<>();

        for(int i =0;i<N;i++){
            Al.add(sc.nextInt());
        }
        System.out.println(evenNumbers(Al));

    }

    public static class AddMatrices {
        public static int[][] AddMatrices(int[][] mat1,int[][] mat2){
            int N = mat1.length;
            int M = mat1[0].length;
            int[][] res = new int[N][M];
            for(int i  =0;i<N;i++){
                for(int j =0;j<M;j++){
                    res[i][j]=mat1[i][j]+mat2[i][j];
                }
            }
            return res;
        }
        public static void main(String[] args) {
            int[][] mat1 = {{1,2,3,4,5},
                            {4,6,3,5,7},
                            {3,6,8,4,2}};

            int[][] mat2 = {{2,4,6,3,6},
                            {4,6,2,7,8},
                            {5,7,4,3,7}};
            System.out.println(Arrays.deepToString(AddMatrices(mat1,mat2)));

        }
    }
}
