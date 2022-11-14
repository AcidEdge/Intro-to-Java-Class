/*package to handle clearing the screen, run again, and sperator lines. 
 * Pretty much a misc package with features/methods that didn't fit in organizationally with the other classes
*/
//imports:
package files;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OutputDisplay {    
    //clear the terminal screen method:        
    public static void clearScreen(){           
        System.out.print("\033[H\033[2J");      //clear screen with ASCii sequence
        System.out.flush();                     //flush the screen 
    }

    //run again method:
    //prints a menu for running again with options, gets input, runs again or exits, and handles wrong input exceptions
    public static void runAgain() throws IOException, InterruptedException{
        Scanner runagain = new Scanner(System.in);
        System.out.println("\n\nWould you like to check another password?");
        System.out.print("1. Yes\n2. No\n>> ");
        try{
        int choice = runagain.nextInt();
        if (choice == 1){           //if input is yes, run PasswordChecker again
            clearScreen();
            PasswordChecker.checkPassword();
        }
        else if (choice == 2){      //if input is no, say goodbye and exit
            System.out.println("\n\n Thank you. Goodbye!");
            System.exit(0);
        }
        else {                      //if input is a number, but not 1 or 2: display error & try again
            System.out.println("Invalid option, please try agian.");
            runAgain();
        }
        }
        catch (InputMismatchException e) {      //if input is not a number, display error & try again
            System.out.println("Invalid input, please try agian");
            runAgain();
        }
    }
//method for displaying a seperation line between input and results output
    public static void seperationLine(){
        for(int i = 1; i <= 65; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
