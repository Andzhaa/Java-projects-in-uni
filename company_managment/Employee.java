package company_managment;

public class Employee {
    private String name;
    private int employeeID;
    private Department department;



    public Employee(String name, int employeeID, Department department) {
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Department getDepartment() {
        return department;
    }
}
