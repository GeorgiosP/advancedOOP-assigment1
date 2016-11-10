package hr;

import java.time.LocalDate;

/**
 * Created by gpsar on 9/20/2016.
 */
public class CommissionsSalesEmployee extends Employee {
    private double grossSales, commissionRate;

    public CommissionsSalesEmployee(String firstName, String lastName, String address, String phoneNumber,
                                    int sin, String gender, LocalDate dateOfBirth, LocalDate dateOfHire,String department, String position, String status,
                                    double grossSales, double commissionRate) {

        super(firstName, lastName, address, phoneNumber, sin, gender, dateOfBirth,dateOfHire, department, position, status);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return this.grossSales;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    /*this will return the information for the
    * Commissions Sales Employee
    * */
    @Override
    public String toString() {
        String commissionEmpInfo = super.toString();

        commissionEmpInfo += "\nGross Sales:\t" + getGrossSales();
        commissionEmpInfo += "\nCommission Rate\t" + getCommissionRate();
        commissionEmpInfo += "\nEarnings: \t" + calculateEarnings();

        return commissionEmpInfo;
    }


    @Override
    public double calculateEarnings() {
        return getGrossSales() * getCommissionRate();
    }
}// end of class
