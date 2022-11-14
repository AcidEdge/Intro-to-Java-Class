/*
 * Mark Witt
 * CSD-320
 * Assignment for module 7
 * Create a method that checks whether a users input String is a valid password, following given password rules.
 * Notes:
 * Provided rules incuded 1 uppercase, 1 lowercase, 1 number, and minimum length of 8 characters. 
 * I added requirements for 1 special character, a max length of 20 characters, and requirements
 * that the user input is not one of the most common passwords.
 * Most common passwords obtained from wikipedia: https://en.wikipedia.org/wiki/List_of_the_most_common_passwords
 * Used Regex for comarison of user input password to a pattern of password requirements. Obtained Regex info/uses from:
 * https://www.digitalocean.com/community/tutorials/regular-expression-in-java-regex-example
 * Regex comparison returns boolean results. 
 * Also implimented a way to compare user input password to the contents of a passwordlist.txt file, a file which 
 * contain the list of common passwords from wikipedia. Program uses .contains(password) to compare password
 * to file contents, returning a boolean result. 
 * For handling passwordlist.txt, On password input line:
 * to read contents of passwordlist.txt - enter: showcommonpasswords 
 * to add another common password to list file - enter: addtopasswordlist
 */

 //imports:
import java.io.IOException;
import files.OutputDisplay;
import files.PasswordChecker;


public class App {

    public static void main(String[] args) throws IOException, InterruptedException  {  //main run method
        OutputDisplay.clearScreen();        //clear screen (for cleaner output of program)
        System.out.println("Welcome to the Witt Enterprises Password Validation Tool. \n\n");
        PasswordChecker.checkPassword();    //begin running password checker
    }
}
