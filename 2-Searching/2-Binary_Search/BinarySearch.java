public class BinarySearch {

    public static void main(String args[]) {
        int[] arr = { -17, -15, -11, -7, -4, 0, 1, 2, 5, 10, 11, 19 };
        int target = 11;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index.
    // return -1 if it does not exist.
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int middle = (start + end) / 2;
            // We could have used the above piece of code to find mid but...
            // what if the middle we want is so large that it exceeds the range of int???
            // So here's a Better way to find middle element...
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // this means target == mid so we found our ans
                return mid;
            }
        }
        // If the return statement above doesn't get hit
        // that means the target element is not in our array.
        // so we return -1 as target doesn't exist in array.
        return -1;
    }
}