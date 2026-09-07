package src;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleOfElement {
    public static ArrayList<ArrayList<Integer>> multipleOfElement(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for(int i =0;i<B.size();i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0;j<A.size();j++){
                if(B.get(i)%A.get(j)==0){
                    row.add(B.get(i));
                }
            }
            mat.add(row);


        }
        return mat;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0;i<N;i++){
            A.add(sc.nextInt());
        }
        ArrayList<Integer> B = new ArrayList<>();
        for(int i =0;i<M;i++){
            B.add(sc.nextInt());
        }
        System.out.println(multipleOfElement(A,B));
    }
}
