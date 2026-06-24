import java.util.Scanner;

public class problem27 {

    public static int sumDigits(int num) {

        // Base case
        if (num == 0) {
            return 0;
        }

        // Recursive relation
        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("Sum of digits = " + sumDigits(num));
        }
    }
}