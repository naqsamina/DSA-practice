package src;

public class PositionOfElement {
    public static int positionOfEle(int[] arr, int B){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==B){
                return  i;
            }
            if(arr[i]!=B){
                continue;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,3,4,8,9,7};
        int B = 4;
        System.out.println(positionOfEle(arr,B));
    }
}
