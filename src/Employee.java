abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}
 class SalariedEmployee extends Employee {
    double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    double calculateSalary() {

        return annualSalary;
    }
}
class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
class CommissionEmployee extends Employee {
    double totalSales;
    double commissionRate;

    public CommissionEmployee(String name, int id, double totalSales, double commissionRate) {
        super(name, id);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    @Override
    double calculateSalary() {
        return totalSales * commissionRate;
    }
}
class EmployeeSalaryCalculator {
    public static void main(String[] args) {

        Employee salariedEmployee = new SalariedEmployee("venkat", 1, 50000);
        Employee hourlyEmployee = new HourlyEmployee("Ramu", 2, 20, 120);
        Employee commissionEmployee = new CommissionEmployee("Chakri", 3, 30000, 10);


        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee};

        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.name);
            System.out.println("Employee ID: " + employee.id);
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }
}