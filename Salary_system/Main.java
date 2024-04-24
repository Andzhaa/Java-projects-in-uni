package Salary_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println(" _____________________________ ");
            System.out.println("|Choose an option:            |");
            System.out.println("|-----------------------------|");
            System.out.println("|1. Register Employee         |");
            System.out.println("|2. Print Employee Data       |");
            System.out.println("|3. Print by position         |");
            System.out.println("|4. Print by Contract         |");
            System.out.println("|5. Delete employee record    |");
            System.out.println("|6. Exit                      |");
            System.out.println("|_____________________________|");

            System.out.print("\n    input number -> ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerEmployee();
                    break;
                case 2:
                    printEmployeeData();
                    break;
                case 3:
                    printByPosition();
                    break;
                case 4:
                    printByContract();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting the program...");
                    System.out.println("Than you for using our programm!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void registerEmployee() {
        System.out.println(" _________________________________________ ");
        System.out.println("|Choose the type of employee to register: |");
        System.out.println("|1. Full-time Employee                    |");
        System.out.println("|2. Part-time Employee                    |");
        System.out.println("|3. Commissioned Employee                 |");
        System.out.println("|4. Base Employee with Commission         |");
        System.out.println("|_________________________________________|");

        System.out.print("\n    input number -> ");
        int TypeChoice = scanner.nextInt();
        scanner.nextLine();

        switch (TypeChoice) {
            case 1:
                registerFullTimeEmployee();
                break;
            case 2:
                registerPartTimeEmployee();
                break;
            case 3:
                registerCommissionedEmployee();
                break;
            case 4:
                registerBaseCommissionEmployee();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void registerFullTimeEmployee() {
        System.out.println("Registering Full-time Employee...");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Social Security nummber: ");
        String socNum = scanner.nextLine();
        System.out.print("Base Salary: ");
        int baseSalary = scanner.nextInt();
        System.out.print("Type of contract: ");
        String contractType = scanner.nextLine();
        scanner.nextLine();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setFirstName(firstName);
        fullTimeEmployee.setLastName(lastName);
        fullTimeEmployee.setBaseSalary(baseSalary);
        fullTimeEmployee.setConractType(contractType);
        fullTimeEmployee.setSocialNum(socNum);
        employees.add(fullTimeEmployee);

        System.out.println("Full-time Employee registered successfully.");
    }

    private static void registerPartTimeEmployee() {
        System.out.println("Registering Part-time Employee...");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Social Security nummber: ");
        String socNum = scanner.nextLine();
        System.out.print("Working Hours: ");
        int workingHours = scanner.nextInt();
        System.out.print("Salary per Hour: ");
        int salaryPerHour = scanner.nextInt();
        System.out.print("Type of contract: ");
        String contractType = scanner.nextLine();
        scanner.nextLine();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setFirstName(firstName);
        partTimeEmployee.setLastName(lastName);
        partTimeEmployee.setWorkingHours(workingHours);
        partTimeEmployee.setSalaryPerHour(salaryPerHour);
        partTimeEmployee.setConractType(contractType);
        partTimeEmployee.setSocialNum(socNum);
        employees.add(partTimeEmployee);

        System.out.println("Part-time Employee registered successfully.");
    }

    private static void registerCommissionedEmployee() {
        System.out.println("Registering Commissioned Employee...");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Social Security nummber: ");
        String socNum = scanner.nextLine();
        System.out.print("Sales Amount: ");
        int salesAmount = scanner.nextInt();
        System.out.print("Salary per Sale: ");
        int salaryPerSale = scanner.nextInt();
        System.out.print("Type of contract: ");
        String contractType = scanner.nextLine();
        scanner.nextLine();

        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setFirstName(firstName);
        commissionEmployee.setLastName(lastName);
        commissionEmployee.setSalesAmount(salesAmount);
        commissionEmployee.setSalaryPerSale(salaryPerSale);
        commissionEmployee.setConractType(contractType);
        commissionEmployee.setSocialNum(socNum);
        employees.add(commissionEmployee);

        System.out.println("Commissioned Employee registered successfully.");
    }

    private static void registerBaseCommissionEmployee() {
        System.out.println("Registering Base Employee with Commission...");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Social Security nummber: ");
        String socNum = scanner.nextLine();
        System.out.print("Base Salary: ");
        int baseSalary = scanner.nextInt();
        System.out.print("Sales Amount: ");
        int salesAmount = scanner.nextInt();
        System.out.print("Salary per Sale: ");
        int salaryPerSale = scanner.nextInt();
        System.out.print("Bonus: ");
        float bonus = scanner.nextFloat();
        System.out.print("Type of contract: ");
        String contractType = scanner.nextLine();
        scanner.nextLine();

        BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee();
        baseCommissionEmployee.setFirstName(firstName);
        baseCommissionEmployee.setLastName(lastName);
        baseCommissionEmployee.setBaseSalary(baseSalary);
        baseCommissionEmployee.setSalesAmount(salesAmount);
        baseCommissionEmployee.setSalaryPerSale(salaryPerSale);
        baseCommissionEmployee.setBonus(bonus);
        baseCommissionEmployee.setConractType(contractType);
        baseCommissionEmployee.setSocialNum(socNum);
        employees.add(baseCommissionEmployee);

        System.out.println("Base Employee with Commission registered successfully.");
    }

    private static void printEmployeeData() {
        System.out.println("============================================");
        System.out.println("            All Employees:");
        System.out.println("============================================");
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("============================================");
        }
    }

    private static void printByPosition() {
        System.out.println(" _____________________________________");
        System.out.println("| Choose the position to filter by:   |");
        System.out.println("| 1. Full-time Employee               |");
        System.out.println("| 2. Part-time Employee               |");
        System.out.println("| 3. Commissioned Employee            |");
        System.out.println("| 4. Base Employee with Commission    |");
        System.out.println("|_____________________________________|");
        System.out.print("\n    input number -> ");
        int positionChoice = scanner.nextInt();
        scanner.nextLine();
    
        System.out.println("============================================");
        switch (positionChoice) {
            case 1:
                System.out.println("    Full-time Employees:");
                System.out.println("============================================");
                for (Employee employee : employees) {
                    if (employee instanceof FullTimeEmployee) {
                        System.out.println(employee);
                        System.out.println("============================================");
                    }
                }
                break;
            case 2:
                System.out.println("Part-time Employees:");
                System.out.println("============================================");
                for (Employee employee : employees) {
                    if (employee instanceof PartTimeEmployee) {
                        System.out.println(employee);
                        System.out.println("============================================");
                    }
                }
                break;
            case 3:
                System.out.println("Commissioned Employees:");
                System.out.println("============================================");
                for (Employee employee : employees) {
                    if (employee instanceof CommissionEmployee) {
                        System.out.println(employee);
                        System.out.println("============================================");
                    }
                }
                break;
            case 4:
                System.out.println("Base Employees with Commission:");
                System.out.println("============================================");
                for (Employee employee : employees) {
                    if (employee instanceof BaseCommissionEmployee) {
                        System.out.println(employee);
                        System.out.println("============================================");
                    }
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void printByContract() {
        System.out.print("\nEnter the contract type to filter by: ");
        String contractType = scanner.nextLine().trim();

        System.out.println("============================================");
        System.out.println("    Employees with Contract Type: " + contractType);
        System.out.println("============================================");
        for (Employee employee : employees) {
            if (employee.getConractType().equalsIgnoreCase(contractType)) {
                System.out.println(employee);
                System.out.println("============================================");
            }
        }
    }

    private static void deleteEmployee() {
    System.out.println("Deleting an Employee...");
    System.out.print("Enter Social Security number of the employee to delete: ");
    String socNum = scanner.nextLine();
    
    Employee employeeToDelete = null;
    for (Employee employee : employees) {
        if (employee.getSocialNum().equals(socNum)) {
            employeeToDelete = employee;
            break;
        }
    }
    
    if (employeeToDelete != null) {
        employees.remove(employeeToDelete);
        System.out.println("Employee with Social Security number " + socNum + " has been deleted.");
    } else {
        System.out.println("No employee found with Social Security number " + socNum + ".");
    }
}
}
