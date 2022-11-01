package CodingPractice.BinarySearch.Assignments;

import java.util.Arrays;

/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn]. */
public class ShuffleTheArray {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        return result;
    }
}
