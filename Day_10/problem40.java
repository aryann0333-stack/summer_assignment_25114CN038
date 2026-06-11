// to print palindromic character pyramid

import java.util.Scanner;

public class problem40 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of character pyramid: ");
            int leng = sc.nextInt();

            // outer loop to control rows
            for (int i = 1; i <= leng; i++) {
                // inner loop for spaces
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }
                // inner loop for first half character
                for (char j = 'A'; j < 'A' + i; j++) {
                    System.out.print(j);
                }
                // inner loop for second half number
                for (char j = (char) ('A' + i - 2); j >= 'A'; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
