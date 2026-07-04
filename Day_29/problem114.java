import java.util.Scanner;

public class problem114 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int choice;

        do {

            System.out.println("\n===== ARRAY MENU =====");
            System.out.println("1. Display");
            System.out.println("2. Sum");
            System.out.println("3. Maximum");
            System.out.println("4. Minimum");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Array = ");

                    for (int num : arr)
                        System.out.print(num + " ");

                    System.out.println();
                    break;

                case 2:

                    int sum = 0;

                    for (int num : arr)
                        sum += num;

                    System.out.println("Sum = " + sum);
                    break;

                case 3:

                    int max = arr[0];

                    for (int num : arr)
                        if (num > max)
                            max = num;

                    System.out.println("Maximum = " + max);
                    break;

                case 4:

                    int min = arr[0];

                    for (int num : arr)
                        if (num < min)
                            min = num;

                    System.out.println("Minimum = " + min);
                    break;

                case 5:

                    System.out.println("Program Ended.");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 5);

        sc.close();
    }
}