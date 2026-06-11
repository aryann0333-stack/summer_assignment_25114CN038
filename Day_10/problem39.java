//to print palindromic traingle 

import java.util.Scanner;

public class problem39 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of pallindromic traingle: ");
            int leng = sc.nextInt();

            // outer loop to control numer of rows
            for (int i = 1; i <= leng; i++) {
                // for spaces
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }
                // for printing number of first half side
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                // for printing number of second half side
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}