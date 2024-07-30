import java.util.Arrays;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        if (count == employees.length) {
            System.out.println("Employee array is full. Cannot add more employees.");
            return;
        }
        employees[count++] = employee;
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].getEmployeeId() + " - " + employees[i].getName() + ", " + employees[i].getPosition() + ", $" + employees[i].getSalary());
        }
    }

    public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[--count] = null; // Decrease count and nullify the last element
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee("E001", "Alice", "Manager", 75000));
        ems.addEmployee(new Employee("E002", "Bob", "Developer", 60000));
        ems.addEmployee(new Employee("E003", "Charlie", "Designer", 55000));

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearch for Employee E002:");
        Employee emp = ems.searchEmployee("E002");
        if (emp != null) {
            System.out.println(emp.getEmployeeId() + " - " + emp.getName() + ", " + emp.getPosition() + ", $" + emp.getSalary());
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee E002:");
        ems.deleteEmployee("E002");
        ems.traverseEmployees();
    }
}
