package OOP_chapter3_encapsulation.src.main.java.encapsulation.exercise2;

/*
 * Exercise 2: Bank Account
 * 
 * In this exercise, you will create a simple bank account management system using encapsulation. 
 * This system will include classes for BankAccount and Customer, and will involve managing customer details and their bank account operations. 
 * The exercise will also include validation and encapsulated logic for depositing, withdrawing, and checking balances.
 * 
 * 1. Bank Account class
 * 
 * Add the following fields to the class:
 *   - accountNumber: string
 *   - balance: double
 *   - customer: string
 * 
 * Create appropriate getters for the fields.
 * 
 * Create a constructor that takes accountNumber and customer as parameters and initializes the fields. Ensure that accountNumber and customer are not null or empty.
 * Initialize the balance to 0.0.
 * 
 * Ensure that accountNumber and customer cannot be modified once set.
 * 
 * 2. Add the following methods to the BankAccount class:
 *   - deposit(double amount): void
 *   - withdraw(double amount): void
 *   - getBalance(): double
 * 
 * Ensure that deposits and withdrawals are valid (i.e., the amount is positive and the balance is sufficient).
 * 
 * 3. Customer class
 * 
 * Create a Customer class with the following fields:
 *   - name: string
 *   - bankAccount: BankAccount
 * 
 * Create appropriate getters and setters for the fields. Ensure that name is not null or empty.
 * 
 * Create a constructor that takes name and accountNumber as parameters and initializes the fields. 
 * Create a private method that creates a new BankAccount object and sets it to the bankAccount field. Call the method in the constructor.
 * 
 * 4. Add the following methods to the Customer class:
 *   - depositToAccount(double amount): void
 *   - withdrawFromAccount(double amount): void
 *   - getAccountBalance(): double
 * 
 * Ensure that the deposit and withdrawal methods call the corresponding methods in the BankAccount class.
 *    
 */

public class BankAccount {

}
