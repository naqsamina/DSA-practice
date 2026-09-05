package src;
import java.util.Scanner;

import java.util.ArrayList;

public class PositiveElements {
    public static ArrayList<Integer> positiveNumber(ArrayList<Integer> Al){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<Al.size();i++){
            int ele = Al.get(i);
            if(ele>0){
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
        System.out.println(positiveNumber(Al));


    }
}
