package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OddNegativeInteger {
    public static ArrayList<Integer>  oddNagativeInteger(ArrayList<Integer> Al){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i< Al.size();i++){
            int ele = Al.get(i);
            if(ele%2!=0 && ele<0){
                res.add(ele);
            }
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(2);
        Al.add(4);
        Al.add(-3);
        Al.add(3);
        Al.add(-2);
        System.out.println(oddNagativeInteger(Al));



    }
}
