package src;

public class ArrayIsSorted {
    public static int ifSorted(int[] arr){
        for (int i =0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
               return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,9};
        System.out.println(ifSorted(arr));

    }
}
