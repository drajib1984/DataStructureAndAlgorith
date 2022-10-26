package CodingPractice.Arrays;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {45, 1, 789, 3658, 141, 7, 598746};
        System.out.println(findNumbers(arr));
    }

    // count the number of integers with even number of digits in it
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);

        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;

    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }
}


