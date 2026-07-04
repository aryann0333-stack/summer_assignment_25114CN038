
import java.util.Scanner;

public class problem120 {

    static void display(String[] name, int[] marks) {

        System.out.println("\n------ Student Records ------");

        for (int i = 0; i < name.length; i++) {

            System.out.println("Name   : " + name[i]);
            System.out.println("Marks  : " + marks[i]);

            if (marks[i] >= 40)
                System.out.println("Result : Pass");
            else
                System.out.println("Result : Fail");

            System.out.println();
        }
    }

    static int total(int[] marks) {

        int sum = 0;

        for (int m : marks)
            sum += m;

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        display(name, marks);

        int totalMarks = total(marks);
        double average = (double) totalMarks / n;

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}