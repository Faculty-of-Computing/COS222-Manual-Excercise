import java.util.Scanner;

public class Project_3{
    public static void main(String[] args){
        char enter_char; //declaration

        Scanner scan = new Scanner(System.in); //input
        System.out.println("Enter a letter:");
        enter_char = scan.nextLine().charAt(0);
        
        if (! Character.isLetter(enter_char)){ //if statement to check if char entered is a letter
            System.out.println("Invalid letter");
        }
            else{
        
                 switch(Character.toLowerCase(enter_char))
                   {
                     case 'a':
                     case 'e':
                     case 'i':  
                     case 'o':
                     case 'u':
                   System.out.println("Vowel");    
                   break;
            
                     default:
                   System.out.println("Consonant");
            
                   }
            }
        scan.close(); //closes Scanner  
 }
}