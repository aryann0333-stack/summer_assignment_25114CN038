
// Program to Move Zeroes to End
import java.util.Scanner;

public class problem60 {
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

            // Logic for moving zeroes to the end
            int j = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }

            // Print array
            System.out.print("Array after moving zeroes to end: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
