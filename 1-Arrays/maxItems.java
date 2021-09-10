public class maxItems {
    public static void main(String[] args) {
        int[] arr = { 1, 12, 33, 14, 25, 6 };
        System.out.println(maxi(arr));
    }

    static int maxi(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
