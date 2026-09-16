package src;

import java.util.ArrayList;

public class MultipleOfEachEle {
    public static ArrayList<ArrayList<Integer>> multipleofEle(ArrayList<Integer>A,ArrayList<Integer>B){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i =0;i<B.size();i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j =0;j<A.size();j++){
                if(A.get(j)%B.get(i)==0){
                    row.add(A.get(j));
                }
            }
            res.add(row);

        }
        return res;
    }



    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(7);
        A.add(6);
        A.add(9);
        A.add(3);
        ArrayList<Integer> B = new ArrayList<>();
        B.add(1);
        B.add(2);


        System.out.println(multipleofEle(A,B));


    }
}
