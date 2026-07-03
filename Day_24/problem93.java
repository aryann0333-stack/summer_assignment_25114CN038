import java.util.Scanner;

public class problem93 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not Rotations");
        } else {

            String temp = str1 + str1;

            if (temp.contains(str2)) {
                System.out.println("Strings are Rotations");
            } else {
                System.out.println("Strings are not Rotations");
            }
        }

        sc.close();
    }
}