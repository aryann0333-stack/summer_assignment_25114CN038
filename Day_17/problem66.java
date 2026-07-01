
// Program to Find Union of Two Arrays
import java.util.Scanner;

public class problem66 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of first array: ");
            int size1 = sc.nextInt();

            int[] arr1 = new int[size1];

            System.out.println("Enter first array elements:");
            for (int i = 0; i < size1; i++) {
                arr1[i] = sc.nextInt();
            }

            System.out.print("Enter size of second array: ");
            int size2 = sc.nextInt();

            int[] arr2 = new int[size2];

            System.out.println("Enter second array elements:");
            for (int i = 0; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }

            int[] union = new int[size1 + size2];
            int newSize = 0;

            // Add first array
            for (int i = 0; i < size1; i++) {
                union[newSize++] = arr1[i];
            }

            // Add unique elements of second array
            for (int i = 0; i < size2; i++) {

                boolean found = false;

                for (int j = 0; j < newSize; j++) {

                    if (arr2[i] == union[j]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    union[newSize++] = arr2[i];
                }
            }

            System.out.println("Union Array:");

            for (int i = 0; i < newSize; i++) {
                System.out.print(union[i] + " ");
            }
        }
    }
}