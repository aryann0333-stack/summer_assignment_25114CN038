//  pyramid using alphabet to print 

import java.util.Scanner;

public class problem35 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of pyramid: ");
            int leng = sc.nextInt();

            // outer loop

            for (int i = 1; i <= leng; i++) {

                char ch = (char) ('A' + i - 1);
                // inner loop for printing

                for (char j = 'A'; j < 'A' + i; j++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}
