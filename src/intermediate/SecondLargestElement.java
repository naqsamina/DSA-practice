package src.intermediate;

public class SecondLargestElement {
    public static int secondLargest(int[] A){
        int LargestEle = -1;
        int secondLargest = -1;

        for(int i =0;i<A.length;i++){
            if(A[i]>LargestEle){
                secondLargest = LargestEle;
                LargestEle = A[i];

            }
            if(A[i]>secondLargest && A[i] !=LargestEle){
                secondLargest = A[i];
            }

        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] A = {2,6,4,22,8,8,5};
        System.out.println(secondLargest(A));

    }
}
