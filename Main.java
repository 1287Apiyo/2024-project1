import java.util.Scanner;

public class Main {

    private static double balance = 10000; // Initial balance

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nWelcome to the ATM!");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = input.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash.");
            System.out.println("Your new balance is: " + balance);
        }
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        balance += amount;
        System.out.println("Your new balance is: " + balance);
    }
}
