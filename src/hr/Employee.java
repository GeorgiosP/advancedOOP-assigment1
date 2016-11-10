package hr;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by gpsar on 9/20/2016.
 */
public abstract class Employee {
    //super class variables
    private String firstName, lastName, position, status,
            gender, address, phoneNumber, department;
    private int empId, sin;
    private LocalDate dateOfHire, dateOfBirth;
    private double payRate, earnings;
    private static int employeeCount;


    public Employee(String firstName, String lastName, String address, String phoneNumber,
                    int sin, String gender, LocalDate dateOfBirth, LocalDate dateOfHire) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sin = sin;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHire = dateOfHire;
        employeeCount++;
    }//end of constructor

    public Employee(String firstName, String lastName, String address, String phoneNumber,
                    int sin, String gender, LocalDate dateOfBirth, LocalDate dateOfHire,
                    String department, String position, String status) {

        this(firstName, lastName, address, phoneNumber, sin, gender, dateOfBirth, dateOfHire);
        this.department = department;
        this.position = position;
        this.status = status;





    }//end of constructor

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }



    public int getEmpId() {
        return empId;
    }

    public int getSin() {
        return sin;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfHire(LocalDate dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSin(int sin) {
        this.sin = sin;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }


    public abstract double calculateEarnings();{

    }

    public LocalDate getDateOfHire() {


        return dateOfHire;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public String toString() {
        String employeeInfo = "";

        /*add the following info
            age
            position
            employee Id
         */


        employeeInfo += "\nName:\t" + getFullName();
        employeeInfo += "\nAge:\t" + getAge();
        employeeInfo += "\nHire Date:\t" + getDateOfHire();
        employeeInfo += "\nDepartment:\t" + getDepartment();
        employeeInfo += "\nPosition:\t" + getPosition();
        employeeInfo += "\nStatus:\t" + getStatus();

        return employeeInfo;
    }
    public long getAge() {

        LocalDate today = LocalDate.now();
        long years = ChronoUnit.YEARS.between(dateOfBirth, today);

        return years;
    }

}
