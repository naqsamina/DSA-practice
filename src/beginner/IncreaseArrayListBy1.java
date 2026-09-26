package src;

import java.util.ArrayList;
import java.util.Scanner;

public class IncreaseArrayListBy1 {
    public static ArrayList<Integer> increaseBy1(ArrayList<Integer> al){
        for(int i =0;i<al.size();i++){
            int oldvalue = al.get(i);
            al.set(i,oldvalue+1);
        }
        return al;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int N = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<N;i++){
            int ele = sc.nextInt();
            al.add(ele);
        }

        System.out.println(increaseBy1(al));


    }
}
