// fibonnacci series using concept of Memoization 

import java.util.Scanner;

public class problem26 {
    public static int fibonnacci(int term, int[] arr) {

        // base condition
        if (term == 0) {
            return 0;
        }
        if (term == 1) {
            return 1;
        }
        // already calculated
        if (arr[term] != -1) {
            return arr[term];
        }
        // storing every term in array and then return
        arr[term] = fibonnacci(term - 1, arr) + fibonnacci(term - 2, arr);
        return arr[term];
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of terms: ");
            int term = sc.nextInt();

            int[] arr = new int[term + 1];

            // initialization with -1
            for (int i = 0; i <= term; i++) {
                arr[i] = -1;
            }
            // call of function
            System.err.print("Fibonnacci series: ");
            for (int i = 0; i <= term; i++) {
                System.out.print(fibonnacci(i, arr) + " ");
            }
        }
    }
}
