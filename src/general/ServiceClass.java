package general;


/**
 * Created by gpsar on 10/9/2016. advanced
 */
public class ServiceClass
{
    private static int employeeId = 10000;

    public static int getEmployeeId()
    {
        return ++employeeId;
    }

    public static void goodbyeMessage(){
        System.out.printf("Goodbye.");
    }

    public static void invalidInput(){
        System.out.printf("Invalid Input! Please try again.");
    }

    public static boolean stringCheck(String testString){
        return testString.trim().isEmpty();
    }

    //get initial message
    public static void getInitialMessage()
    {
        System.out.println("Welcome!");
        System.out.println("1: Search Employee");
        System.out.println("2: Create Hourly Employee");
        System.out.println("3: Create Commission Employee");
        System.out.println("4: Create Salary Employee");
        System.out.println("5: Search Products");
        System.out.println("0: Exit");
    }


}