package company_managment;

import java.util.List;
import java.util.Scanner;

public class CompanyManagmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        int choice = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n     ____________________________________ ");
            System.out.println("    | Company Management System          |");
            System.out.println("    |------------------------------------|");
            System.out.println("    | 1. Add a new department            |");
            System.out.println("    | 2. Add an employee to a department |");
            System.out.println("    | 3. Display the company structure   |");
            System.out.println("    | 4. Quit the program                |");
            System.out.println("    |____________________________________|");
            System.out.print("\n Enter your choice -> ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("\n Invalid input. Please enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter department name: ");
                    String departmentName = scanner.nextLine();
                    Department newDepartment = new Department(departmentName);
                    company.addDepartment(newDepartment);
                    System.out.println("Department added successfully!");
                    System.out.print("\nPress 'Enter' to continue.");
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.print("Enter employee name: ");                
                    while (scanner.hasNextInt()) {
                        System.out.print("Invalid name. Please enter a valid employee name: ");
                        scanner.next();
                    }
                    String employeeName = scanner.nextLine();

                    System.out.print("Enter employee ID: ");
                    int employeeID;
                    while (!scanner.hasNextInt()) {
                        System.out.print("Invalid input. Please enter a valid employee ID: ");
                        scanner.next();
                    }
                    employeeID = scanner.nextInt();
                    scanner.nextLine();

                    List<Department> departments = company.getDepartments();
                    if (departments.isEmpty()) {
                        System.out.println("No departments available. Add a department first.");
                        break;
                    }

                    System.out.println("Available departments:");
                    for (int i = 0; i < departments.size(); i++) {
                        System.out.println((i + 1) + ". " + departments.get(i).getName());
                    }

                    System.out.print("Choose a department (enter the number): ");
                    int departmentChoice;
                    while (!scanner.hasNextInt() || (departmentChoice = scanner.nextInt()) < 1 || departmentChoice > departments.size()) {
                        System.out.print("Invalid input. Please enter a valid number: ");
                        scanner.next();
                    }
                    scanner.nextLine();
                    Employee newEmployee = new Employee(employeeName, employeeID, departments.get(departmentChoice - 1) );

                    departments.get(departmentChoice - 1).addEmployee(newEmployee);
                    System.out.println("Employee added successfully!");
                    System.out.print("\nPress 'Enter' to continue.");
                    scanner.nextLine();
                    break;

                case 3:
                    company.displayCompanyStructure();
                    System.out.print("\nPress 'Enter' to continue.");
                    scanner.nextLine();
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
