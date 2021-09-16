public class OrderAgnosticBS {
    public static void main(String args[]) {
        int[] arrAsc = { -17, -15, -11, -7, -4, 0, 1, 2, 5, 10, 11, 19 };
        int[] arrDesc = { 99, 85, 77, 14, 13, 11, 10, 8, 0, -1, -8, -77 };
        int target = 11;
        int ans = orderAgnosticBS(arrDesc, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find wherther arr is sorted in anscending or descending...
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
