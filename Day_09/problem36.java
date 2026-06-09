
// hollow square  printing uusing (*)

import java.util.Scanner;

public class problem36 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter side of square: ");
            int side = sc.nextInt();

            // outer loop

            for (int i = 1; i <= side; i++) {

                // inner loop for printing

                for (int j = 1; j <= side; j++) {
                    if (i == 1 || j == 1 || j == side || i == side) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }
}
