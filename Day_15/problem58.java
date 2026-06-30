
// Program to Rotate Array Left by 1
import java.util.Scanner;

public class problem58 {
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

            // Logic for left rotation
            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = temp;

            // Print array
            System.out.print("Array after left rotation: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
