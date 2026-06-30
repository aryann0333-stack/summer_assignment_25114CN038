
//  a program to Second largest element.
import java.util.Scanner;

public class problem55 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // declaration of array
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            // input of array
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // logic for second largest element
            int secondlargest = -1;
            int largest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondlargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondlargest && arr[i] != largest) {
                    secondlargest = arr[i];
                }
            }
            System.out.println("Second Largest Element: " + secondlargest);
        }
    }
}