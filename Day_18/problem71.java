
// Program to Binary Search
import java.util.Scanner;

public class problem71 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter sorted array elements:");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter element to search: ");
            int key = sc.nextInt();

            int low = 0;
            int high = size - 1;
            int found = -1;

            while (low <= high) {

                int mid = (low + high) / 2;

                if (arr[mid] == key) {
                    found = mid;
                    break;
                } else if (key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            if (found != -1) {
                System.out.println("Element found at index " + found);
            } else {
                System.out.println("Element not found.");
            }
        }
    }
}