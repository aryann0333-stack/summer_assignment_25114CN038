
// Program to Rotate Array Right by 1
import java.util.Scanner;

public class problem59 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaration of array
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            // Input of array
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // Logic for right rotation
            int temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = temp;

            // Print array
            System.out.print("Array after right rotation: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}