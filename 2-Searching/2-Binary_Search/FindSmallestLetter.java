// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// 744. Find Smallest Letter Greater Than Target
// Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
// Note that the letters wrap around.
// For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

// Example 1:
// Input: letters = ["c","f","j"], target = "a"
// Output: "c"

public class FindSmallestLetter {

    public static void main(String args[]) {
        char[] arr = { 'c', 'f', 'h', 'k', 'o', 'r', 's' };
        // char[] arr = { 'e', 'e', 'e', 'n', 'n', 'n' };
        char target = 'z';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }

    // Explanation -
    // Firstly, given array is sorted so we'll try running Binary Search..
    // since we don't need to return the index or the character where element is
    // found
    // what we can do is we can remove the return mid from else statement like we
    // usually do in normal BS
    // and return the modulus of starting position by length of array...

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
        // Here we cannot directly return start beacuse
        // if the target is greater than the value of elements present in the array the
        // value
        // of start will be the index of last element.
        // But the given question says that if such is the case we return the first
        // element. "LETTER WRAP AROUND CONSTRAINT"
    }
}
