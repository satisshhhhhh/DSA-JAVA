// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// 34. Find First and Last Position of Element in Sorted Array
// Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

class FirstAndLastPos {

    public static void main(String args[]) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 8, 8, 10, 11, 12, 15 };
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(ans);
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    // this function will just return the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = end - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}