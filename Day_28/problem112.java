import java.util.Scanner;

public class problem112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("\n------ Contact Details ------");
        System.out.println("Contact ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Mobile     : " + mobile);
        System.out.println("Email      : " + email);
        System.out.println("Address    : " + address);

        sc.close();
    }
}