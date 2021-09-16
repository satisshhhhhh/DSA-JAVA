class Patterns {
    public static void main(String args[]) {
        // pattern1(4);
        // System.out.println();
        pattern4(4);
    }

    static void pattern1(int n) {
        // *
        // * *
        // * * *
        // * * * *
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern2(int n) {
        // * * * *
        // * * *
        // * *
        // *
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern3(int n) {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n) {
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}