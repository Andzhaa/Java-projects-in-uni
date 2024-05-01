package company_managment;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Department> departments;

    public Company() {
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyStructure() {
        System.out.printf(" %s \n", "_".repeat(47));
        System.out.println("|               Company Structure               |");
        System.out.printf("|%s|\n", "-".repeat(47));
        System.out.printf("|%-20s|%-10s|%-15s|\n", "Name", "ID", "Department");
        System.out.printf("|%s|\n", "_".repeat(47));
        for (Department department : departments) {
            department.displayEmployeesTableFormat();
        }
        System.out.printf("|%s|\n", "_".repeat(47));
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
