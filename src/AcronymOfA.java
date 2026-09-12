package src;

import java.util.ArrayList;

public class AcronymOfA {
    public static int isAcronym(ArrayList<String> Al, String B){
        if(Al.size()!=B.length()){
            return 0;
        }
        for(int i =0;i<Al.size();i++){
            String ele = Al.get(i);
            if(ele.charAt(0)!=B.charAt(i)){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        ArrayList<String> Al = new ArrayList<>();
        Al.add("Australia");
        Al.add("America");
        Al.add("India");
        Al.add("Dubai");
        String B= "AAID";
        System.out.println(isAcronym(Al,B));




    }
}
