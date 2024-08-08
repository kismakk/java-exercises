package test.java.maps;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.maps.solution.Employee;
import main.java.maps.solution.EmployeeManager;

public class EmployeeManagerTest {
    private EmployeeManager employeeManager;

    @BeforeEach
    public void setUp() {
        employeeManager = new EmployeeManager();
    }

    @Test
    public void testAddEmployee() {
        Employee employee = new Employee("John Doe", "123", 50000);
        employeeManager.addEmployee(employee);
        assertEquals(employee, employeeManager.getEmployee("123"));
    }

    @Test
    public void testRemoveEmployee() {
        Employee employee = new Employee("John Doe", "123", 50000);
        employeeManager.addEmployee(employee);
        employeeManager.removeEmployee("123");
        assertNull(employeeManager.getEmployee("123"));
    }

    @Test
    public void testUpdateEmployeeSalary() {
        Employee employee = new Employee("John Doe", "123", 50000);
        employeeManager.addEmployee(employee);
        employeeManager.updateEmployeeSalary("123", 60000);
        assertEquals(60000, employeeManager.getEmployee("123").getSalary());
    }

    @Test
    public void testGetAllEmployees() {
        Employee employee1 = new Employee("John Doe", "123", 50000);
        Employee employee2 = new Employee("Jane Doe", "456", 60000);
        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);
        assertEquals(2, employeeManager.getAllEmployees().size());
    }
}
