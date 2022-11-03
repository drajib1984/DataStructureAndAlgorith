package YouTubeCodingQuestions;

public class MissingNNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        int arr_sum=0;
        int actual_sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum=arr_sum+arr[i];
        }
        System.out.println(arr_sum);
        for (int i = 1; i < 10; i++) {
            actual_sum=actual_sum+i;
        }
        System.out.println(actual_sum);
        System.out.println("Missing number is: "+(actual_sum-arr_sum));
    }
}
