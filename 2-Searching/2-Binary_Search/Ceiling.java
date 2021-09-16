public class Ceiling {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 18;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // returns the index of smallest no >= target
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // but what is the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start; // returns the index of the element
        // return arr[start]; //returns the element
    }
}
