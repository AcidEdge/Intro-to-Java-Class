/**
 * Mark Witt
 * CSD-320-345A
 * Module 4 Assignment
 * GitHub Link: https://github.com/AcidEdge/csd-320.git
 * User enters 2 strings, program compares both and depermines if a string is a subset of the other string. 
 * string inputs are formatted as lowercase after input to ensure acurate comparison regardless of input case. 
 * program includes a run again menu after string comparison, and menu includes invalid input exception handling. 
 *
 * @author markwitt
 */

 //imports:
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    //create scanner input objects:
    static Scanner input = new Scanner(System.in); 
    

    //compare strings method: (gets input, compares strings, gives output results)
    static void compareStrings(){
        
        //get string inputs:
        System.out.println("Please note: this program is NOT case sensitive.\n");
        System.out.print("Please enter the first string to be compared: ");
        String stringA = input.nextLine().toLowerCase();
        System.out.print("\nPlease enter the second string to be compared: ");
        String stringB = input.nextLine().toLowerCase();
        
        //clear screen and output comparing/processing wait:
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Comparing.");
        for (int x = 0; x <5; x++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
            System.out.print(".");
        }

        //comparison logic:
        boolean bSubOfA = stringA.contains(stringB); //returns true if string A contains string B, if not then false
        boolean aSubOfB = stringB.contains(stringA); //returns true if string B contains string A, if not then false
        
        //output:
        System.out.println("Results:");
        if (bSubOfA == false && aSubOfB == false){   //output if strings are are not substrings of eachother
            System.out.println("The string: " + stringA);
            System.out.println("and the String: " + stringB);
            System.out.println("do not contain any substrings of each other.");
        }
        else if (stringA.equals(stringB)){      //output if both strings are the same
            System.out.println("String Entered: " + stringA);
            System.out.println("Both Strings are the same");
        }
        else if (bSubOfA == true){      //output if string A contains string B
            System.out.println("The String: " + stringA + "\t(String A)");
            System.out.println("contains the String: " + stringB + "\t(String B)");
            System.out.println("String B is a substring of String A");
        }
        else if (aSubOfB == true){      //output if string B contains string A
            System.out.println("The String: " + stringB + "\t(String B)");
            System.out.println("contains the String: " + stringA + "\t(String A)");
            System.out.println("String A is a substring of String B"); 
        } 
        runAgain(); // runs the run agin menu method
    }

//run comparison again method:
    static void runAgain(){
        System.out.println("\n\nWould you like to compare another set of Strings?");
        System.out.print("1: Run again\n2: Exit\nChoice: ");
        while(true){
            try{  //try to execute run again user input. 
                Scanner choice = new Scanner(System.in);
                int againChoice = choice.nextInt();
                if (againChoice != 1 && againChoice != 2){   //if input is a number other than 1 or 2, handle with this:
                    System.out.print("Error. Please enter a valid selection.\nChocie: ");
                }
                else if (againChoice == 1){
                    System.out.print("\033[H\033[2J");  //clears the terminal screen with ascii command
                    compareStrings();   //runs comparison agian
                }
                else {
                    System.out.print("\033[H\033[2J");      //clears terminal screen
                    System.exit(0);     //exits program
                }
            }
            catch (InputMismatchException e){  //catch invalid input exception, display error message and enter again.
                System.out.print("Error. Please enter a valid selection.\nChoice: ");
            }
        }      
    }
    
    public static void main(String[] args)  {       //main java method... runs overall program.
        System.out.print("\033[H\033[2J"); //clears terminal screen
        System.out.println("Welcome to the Mark Witt Enterprises: String Comparison Utility.");
        compareStrings();
        }   
    }