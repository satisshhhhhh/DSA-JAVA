import java.util.Arrays;

// Also known as Sinking Sort and exchange sort.
// Compares the adjacent terms.
// On first iteration the largest term is found at the end.

// Space complexity = O(n) -> constant -> No extra space required i.e. like copying the array
//                                        aka inplace sorting algorithm 

// Time Complexity :
// Best case: O(N) -> sorted
// Worst case: O(N^2) -> sorted in descending order

// As size of array grows, N i.e. no=umber of comparisons also increasing

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 6, 7, 9, 1, 13, 5, 7, 9, 565, 98, 95, 65 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap item if smaller than previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted
            // hence stop the program
            if (!swapped) {
                break;
            }
        }
    }
}