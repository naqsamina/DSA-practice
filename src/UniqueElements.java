package src;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueElements {
    public static ArrayList<Integer> uniqueElements(ArrayList<Integer> Al){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<Al.size();i++){
            int count= 0;
            int ele = Al.get(i);
            for(int j =0;j<Al.size();j++){
                int ele2 = Al.get(j);
                if(ele==ele2){
                    count++;
                }
            }
            if(count ==1){
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
        System.out.println(uniqueElements(Al));

    }
}
