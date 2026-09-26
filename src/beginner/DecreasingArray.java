package src;

public class DecreasingArray {
    public static int StrictlyDecreasing(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return 0;

            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,5,4,3,2,1};
        System.out.println(StrictlyDecreasing(arr));

    }
}
