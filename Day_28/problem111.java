import java.util.Scanner;

public class problem111 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        System.out.print("Enter Price Per Ticket: ");
        double price = sc.nextDouble();

        double total = tickets * price;

        System.out.println("\n------ Ticket Details ------");
        System.out.println("Passenger   : " + name);
        System.out.println("Source      : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Tickets     : " + tickets);
        System.out.println("Total Fare  : Rs." + total);

        sc.close();
    }
}