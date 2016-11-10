package general;

import hr.CommissionsSalesEmployee;
import hr.Employee;
import hr.HourlyEmployee;
import hr.SalaryEmployee;
import manufacturer.Manufacturer;
import products.Product;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        Product tile = new Product("Xilo",19.99,new Manufacturer("Tile Bros", "Oakville","FOB"));
        Product tile2 = new Product("Blanca",7.99,new Manufacturer("Olympia", "Toronto","CIF"));
        Product tile3 = new Product("Ardoise du Brésil",29.99,new Manufacturer("Ceragres", "Montreal","FOB"));

        products.add(tile);
        products.add(tile2);
        products.add(tile3);

        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        int input = 3;

        do{
            ServiceClass.getInitialMessage();
            input = keyboard.nextInt();

            if (input == 0) {
                keepGoing = false;
            }
            else if (input == 1) {
                System.out.println("What Employee do you want to find: ");
                String empSearch = keyboard.next();
                for(int i = 0; i < employees.size(); i++){
                    if(employees.get(i).toString().contains(empSearch)){
                        System.out.println(employees.get(i).toString());
                    }

                }

            }
            else if (input == 2) {
                HourlyEmployee hourlyEmployee = createHourlyEmployee();
                employees.add(hourlyEmployee);
            }
            else if (input == 3) {
                CommissionsSalesEmployee commissionsSalesEmployee = createCommissionSalesEmployee();
                employees.add(commissionsSalesEmployee);
            }
            else if (input == 4) {
                SalaryEmployee salaryEmployee = createSalaryEmployee();
                employees.add(salaryEmployee);
            }
            else if (input == 5) {
                System.out.println("What Product do you want to find: ");
                String productSearch = keyboard.next();
                for(int i = 0; i < products.size(); i++){
                    if(products.get(i).toString().contains(productSearch)){
                        System.out.println(products.get(i).toString());
                    }

                }
            }
        }while (keepGoing);
    }

    public static CommissionsSalesEmployee createCommissionSalesEmployee() {
        Scanner keyboard = new Scanner(System.in);
        String first, last, address, phone, gender, department,
                position, status;
        int birthYear, hireYear, birthMonth, hireMonth, birthDay, hireDay, sin;
        LocalDate dob, doh;
        double commissionRate, grossSales;

        System.out.printf("First Name: ");
        first = keyboard.nextLine();
        System.out.printf("Last Name: ");
        last = keyboard.nextLine();
        System.out.printf("Address: ");
        address = keyboard.nextLine();
        System.out.printf("Phone Number: ");
        phone = keyboard.nextLine();
        System.out.printf("SIN: ");
        sin = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Gender: ");
        gender = keyboard.nextLine();
        System.out.printf("Department: ");
        department = keyboard.nextLine();
        System.out.printf("Position: ");
        position = keyboard.nextLine();
        System.out.printf("Status: ");
        status = keyboard.nextLine();
        System.out.printf("Year of Birth: ");
        birthYear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month of Birth: ");
        birthMonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day of Birth: ");
        birthDay = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Year Hired: ");
        hireYear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month Hired: ");
        hireMonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day Hired: ");
        hireDay = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Gross Sales: ");
        grossSales = Double.parseDouble(keyboard.nextLine());
        System.out.printf("Commission Rate: ");
        commissionRate = Double.parseDouble(keyboard.nextLine());

        //Date of hire
        dob = LocalDate.of(birthYear, Month.of(birthMonth), birthDay);
        //Date of birth
        doh = LocalDate.of(hireYear, Month.of(hireMonth), hireDay);
        // create the employee from the users inputs
        CommissionsSalesEmployee tempCommEmp = new CommissionsSalesEmployee(first, last, address, phone,
                sin, gender, dob, doh, department, position, status, commissionRate, grossSales);

        System.out.printf(tempCommEmp.toString());

        return tempCommEmp;
    }

    public static HourlyEmployee createHourlyEmployee() {
        Scanner keyboard = new Scanner(System.in);
        String first, last, address, phone, gender, department,
                position, status;
        int birthYear, hireYear, birthMonth, hireMonth, birthDay, hireDay, sin;
        LocalDate dob, doh;
        double hourlyWage, hoursWorked;

        System.out.printf("First Name: ");
        first = keyboard.nextLine();
        System.out.printf("LastName: ");
        last = keyboard.nextLine();
        System.out.printf("Address: ");
        address = keyboard.nextLine();
        System.out.printf("Phone Number: ");
        phone = keyboard.nextLine();
        System.out.printf("SIN: ");
        sin = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Gender: ");
        gender = keyboard.nextLine();
        System.out.printf("Department: ");
        department = keyboard.nextLine();
        System.out.printf("Position: ");
        position = keyboard.nextLine();
        System.out.printf("Status: ");
        status = keyboard.nextLine();
        System.out.printf("Year of Birth: ");
        birthYear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month of Birth: ");
        birthMonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day of Birth: ");
        birthDay = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Year Hired: ");
        hireYear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month Hired: ");
        hireMonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day Hired: ");
        hireDay = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Hourly Wage: ");
        hourlyWage = Double.parseDouble(keyboard.nextLine());
        System.out.printf("Hours Worked: ");
        hoursWorked = Double.parseDouble(keyboard.nextLine());

        //Date of hire
        dob = LocalDate.of(birthYear, Month.of(birthMonth), birthDay);
        //Date of birth
        doh = LocalDate.of(hireYear, Month.of(hireMonth), hireDay);

        // create the employee from the users inputs
        HourlyEmployee tempHourly = new HourlyEmployee(first, last, address, phone,
                sin, gender, dob, doh, department, position, status, hourlyWage,
                hoursWorked);

        System.out.printf(tempHourly.toString());

        return tempHourly;
    }

    public static SalaryEmployee createSalaryEmployee() {
        Scanner keyboard = new Scanner(System.in);
        String first, last, address, phone, gender, department,
                position, status;
        int birthYear, hireYear, birthMonth, hireMonth, birthDay, hireDay, sin;
        LocalDate dob, doh;
        double salary;

        System.out.printf("First Name: ");
        first = keyboard.nextLine();
        System.out.printf("LastName: ");
        last = keyboard.nextLine();
        System.out.printf("Address: ");
        address = keyboard.nextLine();
        System.out.printf("Phone Number: ");
        phone = keyboard.nextLine();
        System.out.printf("SIN: ");
        sin = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Gender: ");
        gender = keyboard.nextLine();
        System.out.printf("Department: ");
        department = keyboard.nextLine();
        System.out.printf("Position: ");
        position = keyboard.nextLine();
        System.out.printf("Status: ");
        status = keyboard.nextLine();
        System.out.printf("Year of Birth: ");
        birthYear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month of Birth: ");
        birthMonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day of Birth: ");
        birthDay = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Year Hired: ");
        hireYear = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Month Hired: ");
        hireMonth = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Day Hired: ");
        hireDay = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Employee Salary: ");
        salary = Double.parseDouble(keyboard.nextLine());

        //Date of hire
        dob = LocalDate.of(birthYear, Month.of(birthMonth), birthDay);
        //Date of birth
        doh = LocalDate.of(hireYear, Month.of(hireMonth), hireDay);
        // create the employee from the users inputs
        SalaryEmployee tempSalary = new SalaryEmployee(first, last, address, phone,
                sin, gender, dob, doh,
                department, position, status, salary);

        System.out.printf(tempSalary.toString());

        return tempSalary;
    }

}