package src;

public class CountOfElements {
    public static int countOfElements(int[] arr){
        int count =0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[]arr = {4,6,83,5,6,7,4};
        System.out.println(countOfElements(arr));

    }
}
