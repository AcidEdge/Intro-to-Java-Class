

import java.util.Scanner;
import java.util.regex.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter Password: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,20}$";
        boolean valid = isvalid(password, regex);
        if (valid == true){
            System.out.println(password + " is a valid password.");
        }
        else {
            System.out.println(password + " is not a valid password");
        }
        
    }

    public static boolean isvalid(String password, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
