// to print star pyramid 

import java.util.Scanner;

public class problem37 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of star pyramid: ");
            int leng = sc.nextInt();

            // outer loop for number of rows
            for (int i = 1; i <= leng; i++) {
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
