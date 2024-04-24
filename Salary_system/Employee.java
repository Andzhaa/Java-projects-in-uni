package Salary_system;

public abstract class Employee {

    private int baseSalary;
    private int workingHours;
    private float bonus;
    private int SalesAmount;
    private int SalaryPerSale;
    private String firstName;
    private String lastName;
    private String socialNum;
    private String conractType;
    private int salaryPerHour;

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public String getConractType() {
        return conractType;
    }

    public void setConractType(String conractType) {
        this.conractType = conractType;
    }

    public String getSocialNum() {
        return socialNum;
    }

    public void setSocialNum(String socialNum) {
        this.socialNum = socialNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getSalaryPerSale() {
        return SalaryPerSale;
    }

    public void setSalaryPerSale(int SalaryPerSale) {
        this.SalaryPerSale = SalaryPerSale;
    }

    public int getSalesAmount() {
        return SalesAmount;
    }

    public void setSalesAmount(int slaesAmmount) {
        this.SalesAmount = slaesAmmount;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract int income();

    public abstract String toString();

}

class FullTimeEmployee extends Employee {

    public int income() {
        int Salary = getBaseSalary();
        return Salary;
        
    }

    public String toString() {
        // Still need to work on this part
        int salary = income();
        return "Full-time Employee: " +
               "\nFirst Name: " + getFirstName() +
               "\nLast Name: " + getLastName() +
               "\nBase Salary: " + salary +
               "\nContract Type: " +getConractType() +
               "\nSocial security nummber: " + getSocialNum();
    }

}

class PartTimeEmployee extends Employee {

    public int income() {
        int Salary = getWorkingHours() * getSalaryPerHour();
        return Salary;
    }

    public String toString() { //Still need to work on this part
        int salary = income();
        return "Part-time Employee:" +
               "\nFirst Name: " + getFirstName() +
               "\nLast Name: " + getLastName() +
               "\nWorking Hours: " + getWorkingHours() +
               "\nSalary: " + salary +
               "\nContract Type: " +getConractType() +
               "\nSocial security nummber: " + getSocialNum();
    }

}

class CommissionEmployee extends Employee {

    public int income() {
        int Salary = getSalaryPerSale() * getSalesAmount();
        return Salary;
    }

    public String toString() {
        // Still need to work om thiss part
        int salary = income();
        return "Commissioned Employee:" +
               "\nFirst Name: " + getFirstName() +
               "\nLast Name: " + getLastName() +
               "\nSales Amount: " + getSalesAmount() +
               "\nSalary: " + salary +
               "\nContract Type: " +getConractType() +
               "\nSocial security nummber: " + getSocialNum();
    }

}

class BaseCommissionEmployee extends CommissionEmployee {
    public int income(){
        int baseSalary = (int) (super.income() + getBaseSalary());
        float Bonus = baseSalary * (getBonus() / 100);
        int fullSalary = (int) (baseSalary + Bonus);
        return fullSalary;
    }

    public String toString() {
        int salary = income();
        return "Base Employee with Commission:" +
               "\nFirst Name: " + getFirstName() +
               "\nLast Name: " + getLastName() +
               "\nBase Salary: " + getBaseSalary() +
               "\nSales Amount: " + getSalesAmount() +
               "\nSalary: " + salary +
               "\nBonus: " + getBonus() + 
               "\nContract Type: " +getConractType() +
               "\nSocial security nummber: " + getSocialNum();
    }

}