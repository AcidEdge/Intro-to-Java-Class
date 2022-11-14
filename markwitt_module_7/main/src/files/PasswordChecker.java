 /* package/class for getting the user input, and to handle displaying the output of password checker.
  * Sends user input and requrirements to Compare package for validation, and recieves boolean validation in return.
  */
  package files;

import java.io.IOException;
import java.util.Scanner;

public class PasswordChecker {

    //setup password requirements:
    static String passwordRequirements = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,20}$";
    static String lowerRequire = "^(?=.*[a-z]).{1,200}$";
    static String upperRequire = "^(?=.*[A-Z]).{1,200}$";
    static String numRequire = "^(?=.*\\d).{1,200}$";
    static String specialRequire = "^(?=.*[!@#$%^&*]).{1,200}$";
    static String lengthRequire = "^.{8,20}$";

    //check password method. lists password requirements, and gets password input from user:
    public static void checkPassword() throws IOException, InterruptedException{
        System.out.println("\nPlease choose a password with the following requirements: ");
        System.out.println("1. Requires at least one uppercase letter");
        System.out.println("2. Requires at least one lowercase letter");
        System.out.println("3. Requires at least one number");
        System.out.println("4. Requires at least one special character (!@#$%^&*)");
        System.out.println("5. Password be at least 8 characters");
        System.out.println("6. Passowrd cannot be/contain the most common passwords");
        Scanner input = new Scanner(System.in);         //scanner & input code
        System.out.print("\n\nEnter Password: ");       
        String password = input.nextLine();
        System.out.println();       //new line for spacing
        if(password.equals("") || password.contains(" ")){
            System.out.println("Error, you did not enter a password!");
            checkPassword();
        }
        if(password.equals("showcommonpasswords")){           //if input is "showcommonpasswords", lists common passwords from file
            PasswordList.showPasswordList();
            OutputDisplay.clearScreen();
            checkPassword();            //restarts password checker after using
        }
       else if(password.equals("addtopasswordlist")){       //if input is "addpasswordtolist", allows user to add common password to prohibited file
            PasswordList.addToPasswordList();
            checkPassword();            //restarts password checker after using
        }
        else{        
        passwordResults(password);      //run password validation
        }
    }

    public static void passwordResults(String password) throws IOException, InterruptedException{
        //Run comparison/validation. first on entire list, then breakdown of each seperate requirement:
        boolean containsCommon = Compare.commonPasswords(password); //compares to list of common passwords in passwordlist.txt
        boolean valid = Compare.isvalid(password, passwordRequirements);    //full validation vs full requirement string
        boolean lower = Compare.isvalid(password, lowerRequire);        //does it contain a lower case
        boolean upper = Compare.isvalid(password, upperRequire);        //does it contain an upper case
        boolean digit = Compare.isvalid(password, numRequire);          //does it contain a number
        boolean special = Compare.isvalid(password, specialRequire);    //does it contain a special char
        boolean length = Compare.isvalid(password, lengthRequire);      //does it meet length requirements
        
        //output/display results section: 
        OutputDisplay.seperationLine();     //use OutputDisplay class method to create seperation line (just for how the output appears)
        if (valid == true && containsCommon == false){      //if passwords is valid & passes all requirements
            System.out.println(password + " is a valid password.");
            }           
        else {                                              //if password has failed validation
            System.out.println(password + " is not a valid password");
            }
        if(containsCommon == true){                         //if password matches/contains a password within the passwordlist.txt file
            System.out.println(password + " is one of the most common passwords.");
        }
        if(lower == false){                                 //if password does not have one lowercase letter
            System.out.println(password + " does not contain at least one lowercase letter.");
        }
        if(upper == false){                                 //if password does not have one uppercase letter
            System.out.println(password + " does not contain at lease one uppercase letter.");
        }
        if (digit == false){                                //if password does not have one number
            System.out.println(password + " does not contain at least one number.");
        }
        if(special== false){                                //if password does not have one special char
            System.out.println(password + " does not contain at least one special character (!@#$%^&*).");
        }
        if(length == false){                                //if password does not meet length requirements
            System.out.println(password + " is " + password.length() + " characters and \ndoes not meet length requirements (8-20 characters).");
        }
        OutputDisplay.runAgain();      //after displaying results, calls the run again method for end of program control
    }
}
