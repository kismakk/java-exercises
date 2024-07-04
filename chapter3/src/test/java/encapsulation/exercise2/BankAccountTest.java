package chapter3.src.test.java.encapsulation.exercise2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import chapter3.src.main.java.encapsulation.solutions.exercise2.BankAccount;

public class BankAccountTest {

    @Test
    void testBankAccountCreation() {
        BankAccount bankAccount = new BankAccount("123456", "John Doe");
        assertEquals("123456", bankAccount.getAccountNumber());
        assertEquals("John Doe", bankAccount.getCustomer());
        assertEquals(0.0, bankAccount.getBalance());
    }

    @Test
    void testBankAccountCreationWithNullAccountNumber() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount(null, "John Doe"),
                "Account number cannot be null.");
    }

    @Test
    void testBankAccountCreationWithEmptyAccountNumber() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount("", "John Doe"),
                "Account number cannot be empty.");
    }

    @Test
    void testBankAccountCreationWithNullCustomer() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount("123456", null),
                "Customer cannot be null.");
    }

    @Test
    void testBankAccountCreationWithEmptyCustomer() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount("123456", ""),
                "Customer cannot be empty.");
    }

    @Test
    void testDeposit() {
        BankAccount bankAccount = new BankAccount("123456", "John Doe");
        bankAccount.deposit(100.0);
        assertEquals(100.0, bankAccount.getBalance());
    }

    @Test
    void testDepositWithNegativeAmount() {
        BankAccount bankAccount = new BankAccount("123456", "John Doe");
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-100.0), "Amount must be positive.");
    }

    @Test
    void testWithdraw() {
        BankAccount bankAccount = new BankAccount("123456", "John Doe");
        bankAccount.deposit(100.0);
        bankAccount.withdraw(50.0);
        assertEquals(50.0, bankAccount.getBalance());
    }
    
    @Test
    void testWithdrawWithNegativeAmount() {
        BankAccount bankAccount = new BankAccount("123456", "John Doe");
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-100.0), "Amount must be positive.");
    }

    @Test
    void testWithdrawWithInsufficientBalance() {
        BankAccount bankAccount = new BankAccount("123456", "John Doe");
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(100.0), "Insufficient balance.");
    }
    
}