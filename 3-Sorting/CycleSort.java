import java.util.Arrays;

// When given numbers from range 1, N --> Use Cyclic Sort
// Ex: Given num 1 to N. Find missing number. or Find the duplicate number.

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
