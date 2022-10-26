package CodingPractice.Arrays;

import java.util.Arrays;

public class ClassExplanation_2 {
    public static void main(String[] args) {
     int [] arr = {12,47,45,78,32,14,69,44};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] arr){
        arr[1]=999;
    }


}
