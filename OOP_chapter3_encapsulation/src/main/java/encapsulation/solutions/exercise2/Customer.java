package OOP_chapter3_encapsulation.src.main.java.encapsulation.solutions.exercise2;

public class Customer {
    private String name;
    private BankAccount bankAccount;

    public Customer(String name, String accountNumber) {
        this.setName(name);
        this.createBankAccount(accountNumber);
    }

    private void createBankAccount(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty.");
        }
        this.bankAccount = new BankAccount(accountNumber, this.name);
    }

    private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Object getBankAccount() {
        return this.bankAccount;
    }

    public void depositToAccount(double amount) {
        this.bankAccount.deposit(amount);
    }

    public Double getAccountBalance() {
        return this.bankAccount.getBalance();
    }

    public void withdrawFromAccount(double amount) {
        this.bankAccount.withdraw(amount);
    }
}
