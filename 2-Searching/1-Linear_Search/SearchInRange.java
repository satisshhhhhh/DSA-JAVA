// Search for 3 in the range of index [1 to 4]
public class SearchInRange {

    public static void main(String args[]) {
        int target = 3;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(search(arr, target, 1, 4));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            // check for element at every index if it is = target.
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this will return if none of the return statements get executed
        // hence the target not found.
        return -1;
    }
}
