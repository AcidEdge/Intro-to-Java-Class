

import java.util.Scanner;
import java.util.regex.*;


public class App {

    static Scanner input = new Scanner(System.in);
    static String passwordRequirements = "^";
    static String passwordLimits;
    public static void main(String[] args) throws Exception {
        passwordRulesChoice();
        
    }

    public static boolean isvalid(String password, String passwordRequirements){
        Pattern pattern = Pattern.compile(passwordRequirements);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean commonPasswords(String password){
        //insert code for does password contain any of the top 20 common passwords...
        //possibly use another class/file for password list?????
        return false ;
    }

    public static void passwordRulesChoice(){
        boolean checkCommonPasswords = false;
        System.out.println("\nPlease choose the following password requirement options: ");
        System.out.println("Note: Enter Choice numbers with no spaces.");
        System.out.println("1. Require at least one uppercase letter");
        System.out.println("2. Require at least one lowercase letter");
        System.out.println("3. Require at least one number");
        System.out.println("4. Require at least one special character (!@#$%^&*)");
        System.out.println("5. Passowrd cannot be/contain the top 20 common passwords");
        System.out.print("Enter choices: ");
        passwordLimits = input.nextLine();
        if (passwordLimits.contains("1")){
            passwordRequirements = passwordRequirements+"(?=.*[a-z])";
        }
        if (passwordLimits.contains("2")){
            passwordRequirements = passwordRequirements+"(?=.*[A-Z])";
        }
        if (passwordLimits.contains("3")){
            passwordRequirements = passwordRequirements+"(?=.*\\d)";
        }
        if (passwordLimits.contains("4")){
            passwordRequirements = passwordRequirements+"(?=.*[!@#$%^&*])";
        }
        if (passwordLimits.contains("5")){
            checkCommonPasswords = true;
        }
        System.out.print("\nPlease enter minimum character count: ");
        String minChar = input.nextLine();
        System.out.print("\nPlease enter maximum character count: ");
        String maxChar = input.nextLine();
        passwordRequirements = passwordRequirements+".{"+minChar+","+maxChar+"}$";
        checkPassword(passwordRequirements, checkCommonPasswords);
    }
    public static void checkPassword(String PasswordRequirements, Boolean checkCommonPasswords){
        System.out.print("\n\nEnter Password: ");
        boolean containsCommon = true;
        String password = input.nextLine();
        System.out.println();
        //String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,20}$";        ***remove for final product
        if(checkCommonPasswords){
            containsCommon = commonPasswords(password);
        }
        boolean valid = isvalid(password, passwordRequirements);
        if (valid == true && containsCommon == false){
            System.out.println(password + " is a valid password.");
        }
        else {
            System.out.println(password + " is not a valid password");
        }
    }
}
