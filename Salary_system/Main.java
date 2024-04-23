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
            System.out.println("\nChoose an option:");
            System.out.println("1. Register Employee");
            System.out.println("2. Print Employee Data");
            System.out.println("3. Print by position");
            System.out.println("4. Print by Contract");
            System.out.println("5. Exit");

            System.out.print("\ninput number -> ");
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
                    running = false;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void registerEmployee() {
        System.out.println("\nChoose the type of employee to register:");
        System.out.println("1. Full-time Employee");
        System.out.println("2. Part-time Employee");
        System.out.println("3. Commissioned Employee");
        System.out.println("4. Base Employee with Commission");

        System.out.print("\ninput number -> ");
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
        System.out.print("Base Salary: ");
        int baseSalary = scanner.nextInt();
        scanner.nextLine();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setFirstName(firstName);
        fullTimeEmployee.setLastName(lastName);
        fullTimeEmployee.setBaseSalary(baseSalary);
        employees.add(fullTimeEmployee);

        System.out.println("Full-time Employee registered successfully.");
    }

    private static void registerPartTimeEmployee() {
        System.out.println("Registering Part-time Employee...");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Working Hours: ");
        int workingHours = scanner.nextInt();
        System.out.print("Salary per Hour: ");
        int salaryPerHour = scanner.nextInt();
        scanner.nextLine();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setFirstName(firstName);
        partTimeEmployee.setLastName(lastName);
        partTimeEmployee.setWorkingHours(workingHours);
        partTimeEmployee.setSalaryPerHour(salaryPerHour);
        employees.add(partTimeEmployee);

        System.out.println("Part-time Employee registered successfully.");
    }

    private static void registerCommissionedEmployee() {
        System.out.println("Registering Commissioned Employee...");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Sales Amount: ");
        int salesAmount = scanner.nextInt();
        System.out.print("Salary per Sale: ");
        int salaryPerSale = scanner.nextInt();
        scanner.nextLine();

        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setFirstName(firstName);
        commissionEmployee.setLastName(lastName);
        commissionEmployee.setSalesAmount(salesAmount);
        commissionEmployee.setSalaryPerSale(salaryPerSale);
        employees.add(commissionEmployee);

        System.out.println("Commissioned Employee registered successfully.");
    }

    private static void registerBaseCommissionEmployee() {
        System.out.println("Registering Base Employee with Commission...");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Base Salary: ");
        int baseSalary = scanner.nextInt();
        System.out.print("Sales Amount: ");
        int salesAmount = scanner.nextInt();
        System.out.print("Salary per Sale: ");
        int salaryPerSale = scanner.nextInt();
        System.out.print("Bonus: ");
        float bonus = scanner.nextFloat();
        scanner.nextLine();

        BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee();
        baseCommissionEmployee.setFirstName(firstName);
        baseCommissionEmployee.setLastName(lastName);
        baseCommissionEmployee.setBaseSalary(baseSalary);
        baseCommissionEmployee.setSalesAmount(salesAmount);
        baseCommissionEmployee.setSalaryPerSale(salaryPerSale);
        baseCommissionEmployee.setBonus(bonus);
        employees.add(baseCommissionEmployee);

        System.out.println("Base Employee with Commission registered successfully.");
    }

    private static void printEmployeeData() {
        System.out.println("\nAll Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void printByPosition() {
        System.out.println("\nPrint by position not yet implemented.");
        // need to figure out how tf to do that
    }

    private static void printByContract() {
        System.out.println("\nPrint by contract not yet implemented.");
        // and same here as in the printByPosition
    }
}
