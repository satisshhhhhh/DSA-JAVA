// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

// Given an array nums of integers, return how many of them contain an even number of digits.

// Example 1:
// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.

// Constraints:
// 1 <= nums.length <= 500
// 1 <= nums[i] <= 10^5

public class FindEvenDigits {
    public static void main(String args[]) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    // function to check whether a number contians even digit or not.
    static boolean even(int num) {
        int numOfDigits = digits(num);
        /*
         * if (numOfDigits % 2 == 0){ return true; }
         */
        return numOfDigits % 2 == 0;
    }

    // Shortcut to find number of digits:
    // (int)(Math.log10(num)) + 1;

    // count number of digits in a number
    static int digits(int num) {
        // if number is negative make it positive and check
        if (num < 0) {
            num = num * -1;
        }
        // if number is 0 than it has one digit right? so yea..
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
