class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;
        int ans = linearSearchMethod(nums, target);
        System.out.println(ans);
    }

    static int linearSearchMethod(int[] arr, int target) {
        // if our arr is empty return -1
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // if none of the return statements run so neither our array is empty
        // nor our target element is present in the array
        return -1;
    }

}