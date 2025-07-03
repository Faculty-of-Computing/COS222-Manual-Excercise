import java.util.Scanner;

public class Project_2{
    
    public static void advise(){
        if(passedCount > ((passedCount/100)*60)){
            System.out.println("increase fees");
        }else{
            System.out.println("Don't increase fees");
        }
        
    }
   public static void main(String[] args){
       int studentsno;
       
       
       Scanner scan = new Scanner(System.in);
       
        while(true){
           System.out.println("Enter number of students");
            if(scan.hasNext()){
            studentsno = scan.nextInt();
            scan.nextLine();
                if(studentsno > 0){
                    break;
                }else{
                    System.out.println("Incorrect input! Enter a postive whole number");
                    scan.next();
                }
            }
       }
             int[] scores = new int[studentsno];
             int[] passed = new int[studentsno];
             int[] failed = new int[studentsno];
       
              int passedCount = 0;
              int failedCount = 0;
       
             
             int i;
       for(i = 0; i < studentsno; i++){
           System.out.println("enter scores:");
           if(scan.hasNext()){
            scores[i] = scan.nextInt();
            scan.nextLine();
              if(scores[i] >= 275){
                passed[passedCount] ++;
               }else{
                failed[failedCount] ++;
                   scan.next();
               }
           }
       }
           System.out.println("number of students admitted:");
             for(i = 0; i < passedCount; i++){
            System.out.print(passed[i] + " ");
            }
            System.out.print("number of students not admitted:");
             for(i = 0; i < failedCount; i++){
            System.out.print(failed[i] + " ");
        }
            scan.close();
   }
}