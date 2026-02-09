import java.util.Scanner;

public class StudentUtilityApp {

    public static void addTwoNumbers(Scanner input){
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int result =num1 + num2;
        System.out.println("Result = " + result);

    }
    public static void checkEvenOrOdd(Scanner input){
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        String answer = (number % 2 == 0)? "EVEN": "ODD";
        System.out.println("The number is an " + answer + " number.");
    }
    public static void printNumbers(Scanner input){
        System.out.println("Enter a number N: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i);
        }
    }
    public static void displayDayOfWeek(Scanner input){
        System.out.println("Enter a number from 1 to 7: ");

        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please select a valid day of the week..!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=== JAVA STUDENT UTILITY APP ===");
            System.out.println("1. Add Two Numbers.");
            System.out.println("2. Check for EVEN or ODD Numbers.");
            System.out.println("3. Print a Number from 1 to N.");
            System.out.println("4. Display day of the Week.");
            System.out.println("5. Exit");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("You selected: Add Two Numbers");
                addTwoNumbers(input);
            } else if (choice == 2) {
                System.out.println("You selected: Check EVEN or ODD");
                checkEvenOrOdd(input);
            } else if (choice == 3) {
                System.out.println("You selected: Print Numbers from 1 to N");
                printNumbers(input);
            } else if (choice == 4) {
                System.out.println("You selected: Display Day of the Week.");
                displayDayOfWeek(input);
            } else if (choice == 5) {
                System.out.println("Thank you for using the app..!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice !=5);
        input.close();
    }
}