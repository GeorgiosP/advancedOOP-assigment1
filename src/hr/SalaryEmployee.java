package hr;

import java.time.LocalDate;

/**
 * Created by gpsar on 9/20/2016. Assignment 1 Advanced OOP
 */
public class SalaryEmployee extends Employee {
    private double baseSalary;

    public SalaryEmployee(String firstName, String lastName, String address, String phoneNumber,
                          int sin, String gender, LocalDate dateOfBirth, LocalDate
                                  dateOfHire, String department, String position, String status,
                          double baseSalary) {
        super(firstName, lastName, address, phoneNumber, sin, gender, dateOfBirth, dateOfHire, department, position, status);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    /*
        this will set the base  salary for a Sales + commission employee
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /*
     * this will return the employee info
     *
     */
    @Override
    public String toString() {
        String salaryCommissionEmpInfo = super.toString();

        salaryCommissionEmpInfo += "\nSalary:\t" + getBaseSalary();


        return salaryCommissionEmpInfo;
    }


    @Override
    public double calculateEarnings() {
        return getBaseSalary();
    }
}
