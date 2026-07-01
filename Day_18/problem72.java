
// Program to Sort Array in Descending Order
import java.util.Scanner;

public class problem72 {
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

                for (int j = i + 1; j < size; j++) {

                    if (arr[i] < arr[j]) {

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println("Array in Descending Order:");

            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}