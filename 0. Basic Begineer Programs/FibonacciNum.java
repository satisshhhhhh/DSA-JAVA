import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int prevIndex = 0;
        int curIndex = 1;
        int count = 2;

        while (count <= n) {
            int temp = curIndex;
            curIndex = curIndex + prevIndex;
            prevIndex = temp;
            count++;
        }
        System.out.println(curIndex);
    }
}