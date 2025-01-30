package com.Assignment2;
import java.util.ArrayList;
import java.util.List;
public interface Payable {
    double calculatePay();
}
class Employee implements Payable {
private double salary;
public Employee(double salary)
{
    this.salary=salary;
}
    @Override
    public double calculatePay() {
        return salary;
    }
}
class Freelancer implements Payable {
    private double hoursWorked;
    private double hourlyRate;

    public Freelancer(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}
class PayrollSystem {
    private List<Payable> payables;

    public PayrollSystem() {
        this.payables = new ArrayList<>();
    }

    public void addPayable(Payable p) {
        payables.add(p);
    }

    public double getTotalPayroll() {
        double totalPay = 0;
        for (Payable p : payables) {
            totalPay += p.calculatePay();
        }
        return totalPay;
    }

    public void displayPayroll() {
        System.out.println("Total Payroll Amount: $" + getTotalPayroll());
    }
}