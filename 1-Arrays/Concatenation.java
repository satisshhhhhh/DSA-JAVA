// https://leetcode.com/problems/concatenation-of-array/
// 1929. Concatenation of Array

import java.util.Arrays;

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]


public class Concatenation {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for ( int i = 0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
