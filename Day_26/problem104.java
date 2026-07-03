import java.util.Scanner;

public class problem104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("===== JAVA QUIZ =====");

        // Question 1
        System.out.println("\n1. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. this");
        System.out.println("4. static");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which loop executes at least once?");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do-while");
        System.out.println("4. foreach");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which method is used to take input in Java?");
        System.out.println("1. input()");
        System.out.println("2. nextInt()");
        System.out.println("3. scanf()");
        System.out.println("4. cin");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score = " + score + " out of 3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score == 2) {
            System.out.println("Good Job!");
        } else if (score == 1) {
            System.out.println("Keep Practicing!");
        } else {
            System.out.println("Better Luck Next Time!");
        }

        sc.close();
    }
}