
// Program to Find Missing Number in Array
import java.util.Scanner;

public class problem61 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter value of n: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + (n - 1) + " elements:");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int totalSum = n * (n + 1) / 2;

            int arraySum = 0;

            for (int i = 0; i < arr.length; i++) {
                arraySum += arr[i];
            }

            int missing = totalSum - arraySum;

            System.out.println("Missing Number = " + missing);
        }
    }
}