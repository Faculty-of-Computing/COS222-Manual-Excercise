package Module_1;

import java.time.Year;
import java.util.Scanner;

public class StaffDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int CurrentYear = Year.now().getValue();


        System.out.println("Enter your staff ID");
        String staffID = sc.nextLine();
        System.out.println("Enter your staff name");
        String staffName = sc.nextLine();
        System.out.println("Enter your year of employment");
        int staffEmploymentYear = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Department");
        String staffDepartment = sc.nextLine();

        int durationOfService = CurrentYear - staffEmploymentYear;


        System.out.println("Staff ID: " + staffID);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Department: " + staffDepartment);
        System.out.println("Staff Duration of Service: " + durationOfService);






    }
}
