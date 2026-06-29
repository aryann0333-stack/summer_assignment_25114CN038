
//  a program to Linear search
import java.util.Scanner;

public class problem53 {
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

            // targeted index
            System.out.print("Enter element to be found: ");
            int targ = sc.nextInt();

            // logic for linear search
            boolean found = false;
            int index = -1;

            for (int i = 0; i < arr.length; i++) {
                if (targ == arr[i]) {
                    found = true;
                    index = i;
                    break;
                }
            }

            if (found) {
                System.out.println("your required element " + targ + " is at index " + index);
            } else {
                System.out.println("Targeted element not found");
            }
        }
    }
}