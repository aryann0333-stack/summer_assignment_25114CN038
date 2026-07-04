import java.util.Scanner;

public class problem109 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        int fine = 0;
        if (days > 15) {
            fine = (days - 15) * 5;
        }

        System.out.println("\n------ Library Record ------");
        System.out.println("Book ID      : " + bookId);
        System.out.println("Book Name    : " + bookName);
        System.out.println("Author       : " + author);
        System.out.println("Issued To    : " + student);
        System.out.println("Days         : " + days);
        System.out.println("Fine         : Rs." + fine);

        sc.close();
    }
}