package YouTubeCodingQuestions;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        int [] arr = {5,7,1,6,9,4,6,10,-8};
        System.out.println(maxNumber(arr));
        System.out.println(minNumber(arr));
    }

    public static int maxNumber(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int minNumber(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
