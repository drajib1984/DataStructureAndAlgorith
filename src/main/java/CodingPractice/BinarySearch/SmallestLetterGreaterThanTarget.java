package CodingPractice.BinarySearch;
/* You are given an array of characters letters that is sorted in non-decreasing order,
and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.*/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char [] arr = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr, 'c'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
