package src.intermediate;

import java.util.ArrayList;

public class LeaderElementsBru {
    public static ArrayList<Integer> leaderElements(ArrayList<Integer> Al){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<Al.size();i++){
            boolean isLeader = true;
            for(int j =i+1;j<Al.size();j++){
                int ele = Al.get(i);
                int ele2 = Al.get(j);
                if(ele2>ele){
                    isLeader = false;
                    break;
                }

            }
            if(isLeader==true){
                res.add(Al.get(i));
            }

        }

        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(3);
        Al.add(5);
        Al.add(2);
        Al.add(8);
        Al.add(1);
        Al.add(6);
        Al.add(3);
        System.out.println(leaderElements(Al));

    }
}
