package src;

public class FrequencyOfX {
    public static int frequencyOfElement(int[] arr, int B){
        int frequency = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] ==B){
                frequency++;
            }
        }
        return frequency;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,9,4,5,8};
        int B = 5;
        System.out.println(frequencyOfElement(arr,B));
    }
}
