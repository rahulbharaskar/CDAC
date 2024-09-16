package rahul.help.towithown;

import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }

    public void showDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(String accountHolder, double balance, double withdrawalLimit) {
        super(accountHolder, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds the limit of: " + withdrawalLimit);
            return false;
        } else {
            return super.withdraw(amount);  
        }
    }

    
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

public class Bank {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal limit: ");
        double withdrawalLimit = sc.nextDouble();

        // Create SavingsAccount object
        SavingsAccount savings = new SavingsAccount(accountHolder, balance, withdrawalLimit);

        int choice;
        do {
            // Display menu options
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Show Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    savings.deposit(depositAmount);
                    break;

                case 2:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    savings.withdraw(withdrawAmount);
                    break;

                case 3:
                    // Show Account Details
                    savings.showDetails();
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);  

        sc.close();
    }
}
