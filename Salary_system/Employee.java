package Salary_system;

public abstract class Employee {

    private int baseSalary;
    private int workingHours;
    private float bonus;
    private int salesAmmount;
    private int salaryPerSales;
    private String firstName;
    private String lastName;
    private String socialNum;
    private String conractType;
    private int salaryPerHour;
    private int numberOfSales;

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }

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

    public int getSalaryPerSales() {
        return salaryPerSales;
    }

    public void setSalaryPerSales(int salaryPerSales) {
        this.salaryPerSales = salaryPerSales;
    }

    public int getSalesAmmount() {
        return salesAmmount;
    }

    public void setSalesAmmount(int slaesAmmount) {
        this.salesAmmount = slaesAmmount;
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
        // seit vajadzes izvadi
        return null;
    }

}

class PartTimeEmployee extends Employee {

    public int income() {
        int Salary = getWorkingHours() * getSalaryPerHour();
        return Salary;
    }

    public String toString() {
        // seit vajadzes izvadi
        return null;
    }

}

class CommisionEmployee extends Employee {

    public int income() {
        int Salary = getSalaryPerSales() * getNumberOfSales();
        return Salary;
    }

    public String toString() {
        // seit vajadzes izvadi
        return null;
    }

}

class BaseCommisionEmployee extends CommisionEmployee {
    public int income(){
        int baseSalary = super.income();
        float Bonus = baseSalary * getBonus() + getBaseSalary();
        return (int) (baseSalary + Bonus);
    }

}