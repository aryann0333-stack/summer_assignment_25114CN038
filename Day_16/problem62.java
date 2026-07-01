
// Program to Find Maximum Frequency Element
import java.util.Scanner;

public class problem62 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter array elements:");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int maxFrequency = 0;
            int element = arr[0];

            for (int i = 0; i < size; i++) {

                int count = 1;

                for (int j = i + 1; j < size; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count > maxFrequency) {
                    maxFrequency = count;
                    element = arr[i];
                }
            }

            System.out.println("Element with Maximum Frequency = " + element);
            System.out.println("Frequency = " + maxFrequency);
        }
    }
}