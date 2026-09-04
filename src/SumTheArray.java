package src;

public class SumTheArray {
    public static int SumOfElements(int[] arr){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {3,6,8,2,5,8,9,5};
        System.out.println(SumOfElements(arr));


    }
}
