
// Program to Merge Two Arrays
import java.util.Scanner;

public class problem65 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // First Array
            System.out.print("Enter size of first array: ");
            int size1 = sc.nextInt();

            int[] arr1 = new int[size1];

            System.out.println("Enter elements of first array:");
            for (int i = 0; i < size1; i++) {
                arr1[i] = sc.nextInt();
            }

            // Second Array
            System.out.print("Enter size of second array: ");
            int size2 = sc.nextInt();

            int[] arr2 = new int[size2];

            System.out.println("Enter elements of second array:");
            for (int i = 0; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }

            // Merge
            int[] merge = new int[size1 + size2];

            for (int i = 0; i < size1; i++) {
                merge[i] = arr1[i];
            }

            for (int i = 0; i < size2; i++) {
                merge[size1 + i] = arr2[i];
            }

            System.out.println("Merged Array:");

            for (int i = 0; i < merge.length; i++) {
                System.out.print(merge[i] + " ");
            }
        }
    }
}