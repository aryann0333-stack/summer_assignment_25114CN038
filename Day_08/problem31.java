
import java.util.Scanner;

public class problem31 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of pyramid: ");
            int leng = sc.nextInt();

            // outer loop

            for (int i = 1; i <= leng; i++) {

                // inner loop for printing

                for (char j = 'A'; j < 'A' + i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
