package src.intermediate;

import java.util.ArrayList;

public class LeaderElementsOpti {
    public static ArrayList<Integer> leaderElements(ArrayList<Integer> Al){
        ArrayList<Integer> res = new ArrayList<>();
        int N = Al.size();
        res.add(Al.get(N-1));
        int max = Al.get(N-1);
        for(int i = N-2;i>=0;i--){
            int ele = Al.get(i);
            if(ele>max){
                max = ele;
                res.add(ele);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(4);
        Al.add(2);
        Al.add(9);
        Al.add(3);
        Al.add(5);
        Al.add(4);
        System.out.println(leaderElements(Al));
    }
}
