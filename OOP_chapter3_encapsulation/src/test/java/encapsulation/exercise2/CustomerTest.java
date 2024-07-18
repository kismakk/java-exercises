package OOP_chapter3_encapsulation.src.test.java.encapsulation.exercise2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import OOP_chapter3_encapsulation.src.main.java.encapsulation.solutions.exercise2.Customer;

public class CustomerTest {

    @Test
    void testCustomerCreation() {
        Customer customer = new Customer("John Doe", "123456");
        assertEquals("John Doe", customer.getName());
        assertNotNull(customer.getBankAccount(), "The bank account should not be null.");
    }

    @Test
    void testCustomerCreationWithNullName() {
        assertThrows(IllegalArgumentException.class, () -> new Customer(null, "123456"),
                "Customer name cannot be null.");
    }

    @Test
    void testCustomerCreationWithEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> new Customer("", "123456"),
                "Customer name cannot be empty.");
    }

    @Test
    void testCustomerCreationWithNullAccountNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Customer("John Doe", null),
                "Account number cannot be null.");
    }

    @Test
    void testCustomerCreationWithEmptyAccountNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Customer("John Doe", ""),
                "Account number cannot be empty.");
    }

    @Test
    void testDepositToAccount() {
        Customer customer = new Customer("John Doe", "123456");
        customer.depositToAccount(100.0);
        assertEquals(100.0, customer.getAccountBalance());
    }

    @Test
    void testDepositToAccountWithNegativeAmount() {
        Customer customer = new Customer("John Doe", "123456");
        assertThrows(IllegalArgumentException.class, () -> customer.depositToAccount(-100.0),
                "Amount must be positive.");
    }

    @Test
    void testWithdrawFromAccount() {
        Customer customer = new Customer("John Doe", "123456");
        customer.depositToAccount(100.0);
        customer.withdrawFromAccount(50.0);
        assertEquals(50.0, customer.getAccountBalance());
    }

    @Test
    void testWithdrawFromAccountWithInsufficientBalance() {
        Customer customer = new Customer("John Doe", "123456");
        customer.depositToAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> customer.withdrawFromAccount(150.0),
                "Insufficient balance.");
    }

    @Test
    void testWithdrawFromAccountWithNegativeAmount() {
        Customer customer = new Customer("John Doe", "123456");
        customer.depositToAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> customer.withdrawFromAccount(-50.0),
                "Amount must be positive.");
    }
}
