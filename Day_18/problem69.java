
// Program to Bubble Sort
import java.util.Scanner;

public class problem69 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter array elements:");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < size - 1; i++) {

                boolean swapped = false;

                for (int j = 0; j < size - i - 1; j++) {

                    if (arr[j] > arr[j + 1]) {

                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        swapped = true;
                    }
                }

                if (!swapped) {
                    break;
                }
            }

            System.out.println("Sorted Array:");

            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}