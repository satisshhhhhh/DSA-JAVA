// https://leetcode.com/problems/search-in-rotated-sorted-array/

// 33. Search in Rotated Sorted Array

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4

// Example 2:
// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1

public class RotatedBS2 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        // modified Binary Search to find the smamllest element
        // then we can just treat it as a sorted array
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            // goal is to let this boundaries meet at the index of the smallest array.
            // this loop will break when we found the smallest element
            int mid = start + (end - start) / 2; // no integer overflow...
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int left = start; // preserving the smallest value...
        // now resetting our boundaries to do a regular binary search
        start = 0;
        end = nums.length - 1;

        // how to know which side to binary search on?
        if (target >= nums[left] && target <= nums[end]) {
            start = left;
        } else {
            end = left;
        }

        // regular binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
