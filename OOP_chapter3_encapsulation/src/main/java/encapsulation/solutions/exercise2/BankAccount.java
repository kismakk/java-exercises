package OOP_chapter3_encapsulation.src.main.java.encapsulation.solutions.exercise2;

public class BankAccount {
    private final String accountNumber;
    private final String customer;
    private double balance;

    public BankAccount(String accountNumber, String customer) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty.");
        }
        this.accountNumber = accountNumber;

        if (customer == null || customer.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer cannot be null or empty.");
        }
        this.customer = customer;

        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }

        this.balance += amount;

        System.out.println(
                "Deposited: " + amount + " to account: " + this.accountNumber + " for customer: " + this.customer);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }

        this.balance -= amount;

        System.out.println(
                "Withdrawn: " + amount + " from account: " + this.accountNumber + " for customer: " + this.customer);
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getCustomer() {
        return this.customer;
    }

}
