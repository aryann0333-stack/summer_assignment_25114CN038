
//  a program to Find duplicates in array
import java.util.Scanner;

public class problem56 {
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

            // logic for finding duplicates
            for (int i = 0; i < arr.length; i++) {

                // check if already processed the element
                int j;
                for (j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        break;
                    }
                }
                if (i == j) {

                    // frquency of elemnts
                    int frequency = 0;
                    for (int k = i; k < arr.length; k++) {
                        if (arr[i] == arr[k]) {
                            frequency++;
                        }
                    }

                    // print duplicate
                    if (frequency > 1) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
        }
    }
}