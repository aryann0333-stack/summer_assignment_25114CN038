
// Program to Find Common Elements in Two Arrays
import java.util.Scanner;

public class problem68 {
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

            System.out.println("Common Elements:");

            for (int i = 0; i < size1; i++) {

                for (int j = 0; j < size2; j++) {

                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i] + " ");
                        break;
                    }
                }
            }
        }
    }
}