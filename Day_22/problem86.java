import java.util.Scanner;

public class problem86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        str = str.trim();

        if (str.length() == 0) {
            System.out.println("Number of words = 0");
        } else {

            int count = 1;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }

            System.out.println("Number of words = " + count);
        }

        sc.close();
    }
}