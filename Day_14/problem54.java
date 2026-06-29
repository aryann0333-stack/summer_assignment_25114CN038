
//  program to Frequency of an element
import java.util.Scanner;

public class problem54 {
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

            // targeted value for frequency
            System.out.print("Enter element: ");
            int target = sc.nextInt();

            // logic for frequency
            int frequency = 0;

            for (int i = 0; i < arr.length; i++) {
                if (target == arr[i]) {
                    frequency++;
                }
            }
            System.out.println("Enterd element frequency is " + frequency);
        }
    }
}