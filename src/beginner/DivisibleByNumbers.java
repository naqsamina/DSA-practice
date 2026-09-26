package src;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleByNumbers {
    public static ArrayList<Integer> divisiblebyNumber(ArrayList<Integer> Al){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<Al.size();i++){
            int ele = Al.get(i);
            if(ele%2==0 && ele%5==0){
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
        System.out.println(divisiblebyNumber(Al));


    }
}
