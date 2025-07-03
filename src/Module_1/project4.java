package Module_1;

import java.util.Scanner; 
import java.time.Year;    

public class project4 {
    public static void main(String[] args){
        String name;
        int year;
        int exam_score;
        int test_score;
        
        //input statements
        Scanner input = new Scanner(System.in);
        System.out.println("name:");
        name = input.nextLine();
        System.out.println("reg. number:");
        String reg = input.nextLine();
        System.out.println("yob:");
        year = input.nextInt();
        input.nextLine();
        System.out.println("department:");
        String dept = input.nextLine();
        System.out.println("exams score:");
        exam_score = input.nextInt();
        input.nextLine();
        System.out.println("Test scores:");
        test_score = input.nextInt();
        input.nextLine();
        
        
        //getting cuurrent year
        int age = Year.now().getValue() - year;
        int total_score = exam_score + test_score;
        
        //formatting outut to dislay in a tabular form
        System.out.printf(" %-20s  %-20s  %-5s  %-15s  %-10s \n",
                          "Registration No.", "Name", "Age", "Department", "Total ");
        System.out.printf(" %-20s  %-20s  %-5d  %-15s  %-10d \n",
                          reg, name, age, dept, total_score);
        


        input.close(); //closes input statements
    }
}
