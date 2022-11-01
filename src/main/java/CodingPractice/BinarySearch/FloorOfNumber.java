package CodingPractice.BinarySearch;
/*floor of a number is a number in an array which is equal to the target number or largest & smaller
 than target number*/

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 87, 90, 458, 853, 45698};
        System.out.println(floorOfNumber(arr, 98));
    }

    public static int floorOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[start]) {
            return -1;
        }
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) {
                return middle;
            }
            if (target < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
                return end;
    }
}

