// https://leetcode.com/problems/peak-index-in-a-mountain-array/

// 852. Peak Index in a Mountain Array
// Let's call an array arr a mountain if the following properties hold:
// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... arr[i-1] < arr[i]
// arr[i] > arr[i+1] > ... > arr[arr.length - 1]
// Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

// Input: arr = [0,1,0]
// Output: 1

// Input: arr = [0,10,5,2]
// Output: 1

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 4, 2, 1 };
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in the desc part of array, this may be the answer, but look at left,
                // that's why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of array
                start = mid + 1;
                // beacuse we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest element because of the
        // above two checks
        // start and end are always trying to find max element in the above two checks
        // hence they are pointing to just one element, that is the max one because that
        // is what the checks say
        // at every point of time for start and end, they have the best possible ans
        // till that time
        // and if we are saying that only one item is remaining, hence cuz of above line
        // that is the best possible answer.
        return start; // or return enda s both are equal.
    }
}
