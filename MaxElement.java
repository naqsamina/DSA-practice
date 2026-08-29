public class MaxElement {
    public static int maxElement(int []  arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr [] = {3,5,6,7,8,4,3,6,7,9,45};
        System.out.println(maxElement(arr));
    }
}
