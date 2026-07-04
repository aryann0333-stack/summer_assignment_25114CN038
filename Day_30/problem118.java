import java.util.Scanner;

public class problem117 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Name of Student " + (i + 1) + ": ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n------ Student Records ------");

        for (int i = 0; i < n; i++) {

            System.out.println("Student : " + name[i]);
            System.out.println("Marks   : " + marks[i]);

            if (marks[i] >= 40)
                System.out.println("Result  : Pass");
            else
                System.out.println("Result  : Fail");

            System.out.println();
        }

        sc.close();
    }
}