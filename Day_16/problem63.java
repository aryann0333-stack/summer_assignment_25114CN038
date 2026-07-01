
// Program to Find Pair with Given Sum
import java.util.Scanner;

public class problem63 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter array elements:");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter target sum: ");
            int target = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < size; i++) {

                for (int j = i + 1; j < size; j++) {

                    if (arr[i] + arr[j] == target) {

                        System.out.println("Pair Found: " + arr[i] + " " + arr[j]);
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("No Pair Found");
            }
        }
    }
}