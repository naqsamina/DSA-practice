package src;

import java.util.ArrayList;

public class RowWiseUniqueElements {
    private static int frequency(ArrayList<Integer> list, int ele){
        int count =0;
        for(int i =0;i<list.size();i++){
            if(ele==list.get(i)){
                count++;
            }
        }
        return count;

    }
    public static ArrayList<ArrayList<Integer>> uniqueEle(ArrayList<ArrayList<Integer>> Al){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i =0;i<Al.size();i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j =0;j<Al.get(0).size();j++){
                int ele = Al.get(i).get(j);
                if(frequency(Al.get(i),ele)==1){
                    row.add(ele);
                }

            }
            res.add(row);

        }
        return res;

    }

       public static void main(String[] args) {
           ArrayList<ArrayList<Integer>> Al = new ArrayList<>();
           ArrayList<Integer> row1 = new ArrayList<>();
           row1.add(8);
           row1.add(6);
           row1.add(8);
           ArrayList<Integer> row2 = new ArrayList<>();
           row2.add(8);
           row2.add(5);
           row2.add(5);

           Al.add(row1);
           Al.add(row2);
           System.out.println( uniqueEle(Al));
       }}

