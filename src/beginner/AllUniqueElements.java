package src;

import java.util.ArrayList;
import java.util.Arrays;

public class AllUniqueElements {
    public static ArrayList<Integer> allUniqueEle(ArrayList<Integer> Al){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<Al.size();i++){
            int ele1=Al.get(i);
            int count =0;
            for(int j =0;j<Al.size();j++){
                int ele2 = Al.get(j);
                if (ele1==ele2){
                    count++;
                }
            }
            if(count==1){
                res.add(ele1);
            }
        }
        return res;

    }
    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(2);
        Al.add(4);
        Al.add(9);
        Al.add(38);
        Al.add(2);
        Al.add(9);
        Al.add(1);
        System.out.println(allUniqueEle(Al));
    }
}
