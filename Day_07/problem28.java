import java.util.Scanner;

public class problem28 {

    static int reverse = 0;

    public static int reverseNum(int num) {

        // Base case
        if (num == 0) {
            return reverse;
        }

        int digit = num % 10;
        reverse = reverse * 10 + digit;

        return reverseNum(num / 10);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("Reversed number = " + reverseNum(num));
        }
    }
}
