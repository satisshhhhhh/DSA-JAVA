// All Patterns programs covered using JAVA

class Patterns {
    public static void main(String args[]) {
        // pattern1(4);
        // System.out.println();
        pattern7(4);
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

    static void pattern5(int n) {
        // *
        // * *
        // * * *
        // * * * *
        // * * *
        // * *
        // *
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row>n ? 2*n-row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
    //      * 
    //     * *
    //    * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row>n ? 2*n-row : row;
            int noOfSpaces = n - totalColsInRow;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {

        for (int row = 1; row <= n ; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}