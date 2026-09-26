package src;

public class CountOfElements {
    public static int countElements(int[] arr){
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
        int[]arr = {3,53,3,4,5,2,1};
        System.out.println(countElements(arr));
        }
    }

