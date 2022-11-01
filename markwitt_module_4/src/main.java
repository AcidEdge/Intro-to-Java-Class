/*
 * Mark Witt
 * CSD-320-345A
 * Module 4 Assignment
 * GitHub Link: https://github.com/AcidEdge/csd-320.git
 * User enters 2 strings, program compares both and depermines if a string is a subset of the other string.
 */

/**
 *
 * @author markwitt
 */

import java.util.Scanner;

public class main {

   
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Mark Witt Enterprises: String Comparison Utility.");
        System.out.println("Please enter the first string to be compared: ");
        String stringA = input.nextLine().toLowerCase();
        System.out.println("Please enter the second string to be compared: ");
        String stringB = input.nextLine().toLowerCase();
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
        boolean bSubOfA = stringA.contains(stringB);
        boolean aSubOfB = stringB.contains(stringA);
        System.out.println("Results:");
        if (bSubOfA == false && aSubOfB == false){
            System.out.println("The string: " + stringA);
            System.out.println("and the String: " + stringB);
            System.out.println("do not contain any substrings of each other.");
        }
        else if (stringA.equals(stringB)){
            System.out.println("String Entered: " + stringA);
            System.out.println("Both Strings are the same");
        }
        else if (bSubOfA == true){
            System.out.println("The String: " + stringA + "\t(String A)");
            System.out.println("contains the String: " + stringB + "\t(String B)");
            System.out.println("String B is a substring of String A");
        }
        else if (aSubOfB == true){
            System.out.println("The String: " + stringB + "\t(String B)");
            System.out.println("contains the String: " + stringA + "\t(String A)");
            System.out.println("String A is a substring of String B"); 
        }
        }

        
    }
    

