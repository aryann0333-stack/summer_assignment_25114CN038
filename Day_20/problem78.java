
// Program to Check Symmetric Matrix
import java.util.Scanner;

public class problem78 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of square matrix: ");
            int n = sc.nextInt();

            int[][] matrix = new int[n][n];

            System.out.println("Enter matrix:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            boolean symmetric = true;

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    if (matrix[i][j] != matrix[j][i]) {
                        symmetric = false;
                        break;
                    }
                }

                if (!symmetric) {
                    break;
                }
            }

            if (symmetric) {
                System.out.println("Matrix is Symmetric.");
            } else {
                System.out.println("Matrix is Not Symmetric.");
            }
        }
    }
}