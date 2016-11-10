package general;

import hr.CommissionsSalesEmployee;
import hr.Employee;
import hr.HourlyEmployee;
import hr.SalaryEmployee;
import manufacturer.Manufacturer;
import products.Product;


import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import static hr.Employee.getEmployeeCount; // this will go into the Service class

/**
 * Created by gpsar on 9/20/2016. testing class
 */
public class driver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        SalaryEmployee employee = new SalaryEmployee("Alex", "Joy", "12 lane road", "705-896-3502",123041,"male", LocalDate.of(1990, Month.of(2), 22)
                ,LocalDate.of(2000, Month.of(2), 22),"test","test","test",23500);

        CommissionsSalesEmployee employee1 = new CommissionsSalesEmployee("John","Joe","221 Mapleview Drive","705-213-2134",112341,"male",LocalDate.of(1972,Month.of(3),4),
                LocalDate.of(2010, Month.of(5),22),"Test","Tester","Testing",250000,.2);

        HourlyEmployee employee2 = new HourlyEmployee("Bob","Kofer","213 Toronto Street","905-412-2102",131451,"male",LocalDate.of(1955,Month.of(5),19)
        ,LocalDate.of(2011, Month.of(10),19),"test","test","test",25.50,500);
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());




        Product tile = new Product("Xilo",19.99,new Manufacturer("Tile Bros", "Oakville","FOB"));
        Product tile2 = new Product("Blanca",7.99,new Manufacturer("Olympia", "Toronto","CIF"));
        Product tile3 = new Product("Ardoise du Brésil",29.99,new Manufacturer("Ceragres", "Montreal","FOB"));

        System.out.println(tile);
        System.out.println(tile2);
        System.out.println(tile3);

    }

}
