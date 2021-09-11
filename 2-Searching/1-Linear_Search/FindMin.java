public class FindMin {

    public static void main(String args[]) {
        int[] arr = { 60, 15, 18, 19, 17, 69, -69, 20 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
