package CodingPractice.BinarySearch;

import java.util.Arrays;

public class ClassExplanation {
    public static void main(String[] args) {
        int [] arrAscending = {1,2,4,9,87,90,458,853,45698};
        int[] arrDescending = {10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4,-5};
        System.out.println(binarySearchAsc(arrAscending, 853));
        System.out.println(binarySearchDesc(arrDescending, -4));
        checkArraySortType(arrAscending);
        checkArraySortType(arrDescending);
    }
// find target element index in ascending order sorted array
    public static int binarySearchAsc(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            // find the middle element
            int middle = start+(end-start)/2;
            if(target<arr[middle]){
                end = middle-1;
            } else if (target>arr[middle]) {
                start=middle+1;
            }else
                return middle;
        }
        return -1;
    }
// find target element in descending ordered sorted array
    public static int binarySearchDesc(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int middle = start+(end-start)/2;
            if(target>arr[middle]){
                end = middle-1;
            }
            else if(target<arr[middle]){
                start = middle+1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

//check array list is ascending or descending order sorted
    public static void checkArraySortType(int [] arr){
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<arr[end]){
            System.out.println("Array sorted in ascending order");
        }
        if(arr[start]<arr[end]){
            System.out.println("Array sorted in descending order");
        }
    }
}
