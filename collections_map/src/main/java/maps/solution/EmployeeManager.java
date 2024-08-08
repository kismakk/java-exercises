package main.java.maps.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManager {
    private Map<String, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public Employee getEmployee(String id) {
        return employees.get(id);
    }

    public void removeEmployee(String id) {
        employees.remove(id);
    }

    public void updateEmployeeSalary(String id, int salary) {
        Employee employee = employees.get(id);
        if (employee != null) {
            employee.setSalary(salary);
        }
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }
}
