package hr;


import java.time.LocalDate;

/**
 * Created by gpsar on 10/10/2016. Assignment 1
 */
public class HourlyEmployee extends Employee {
    private double hoursWorked, payRate;

    public HourlyEmployee(String firstName, String lastName, String address, String phoneNumber,
                          int sin, String gender, LocalDate dateOfBirth, LocalDate dateOfHire,
                          String department, String position, String status, double payRate,
                          double hoursWorked){
        super(firstName, lastName, address, phoneNumber, sin, gender, dateOfBirth, dateOfHire, department, position, status);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;



    }


    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculateEarnings() {
        return getPayRate() * getHoursWorked() ;
    }

    @Override
    public String toString() {
        String hourlyEmployeeInfo = super.toString();
        hourlyEmployeeInfo += "\nHourly Rate:\t" + getPayRate();
        hourlyEmployeeInfo += "\nHours worked\t" + getHoursWorked();
        hourlyEmployeeInfo += "\nEarnings:\t" + calculateEarnings();
        return hourlyEmployeeInfo;
    }
}
