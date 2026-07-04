import java.util.Scanner;

public class problem110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        long accountNo = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();

        balance += deposit;

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }

        System.out.println("\n------ Account Details ------");
        System.out.println("Account No : " + accountNo);
        System.out.println("Name       : " + name);
        System.out.println("Balance    : " + balance);

        sc.close();
    }
}