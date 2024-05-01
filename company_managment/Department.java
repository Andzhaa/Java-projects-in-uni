package company_managment;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;
    

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployeesTableFormat() {
        for (Employee employee : employees) {
            String departmentName = employee.getDepartment().getName();
            System.out.printf("|%-20s|%-10s|%-15s|\n", employee.getName(), employee.getEmployeeID(), departmentName);
            System.out.printf("|%s|\n", "-".repeat(47));
        }
    }

    public String getName() {
        return name;
    }
}
