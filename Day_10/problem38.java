// to print invert star pyramid 

import java.util.Scanner;

public class problem38 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of star pyramid: ");
            int leng = sc.nextInt();

            // outer loop for number of rows
            for (int i = leng; i >= 1; i--) {
                // for spaces
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }
                // for printing stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
