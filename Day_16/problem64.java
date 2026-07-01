
// Program to Remove Duplicates from Array
import java.util.Scanner;

public class problem64 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            int[] unique = new int[size];

            System.out.println("Enter array elements:");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int newSize = 0;

            for (int i = 0; i < size; i++) {

                boolean duplicate = false;

                for (int j = 0; j < newSize; j++) {

                    if (arr[i] == unique[j]) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    unique[newSize] = arr[i];
                    newSize++;
                }
            }

            System.out.println("Array after removing duplicates:");

            for (int i = 0; i < newSize; i++) {
                System.out.print(unique[i] + " ");
            }
        }
    }
}