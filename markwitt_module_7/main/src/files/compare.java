/*Package for hadling the actual comparison/validation. 
 *This package handles comparing user input vs common password file, and
 *uses Regex to compare the pattern of the user input password to the 
 *stated requirements. Package gets password and requirements from PasswordChecker class.
 *Once comparison is made, returns boolean results to PackageChecker class.
*/

package files;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.*;
public class Compare {
 
    public static boolean comparison;  

    static String passlist;
    public static boolean commonPasswords(String password) throws FileNotFoundException{

        File passListFile = new File("main/src/files/passwordlist.txt");
        Scanner listScanner = new Scanner(passListFile);
        while(listScanner.hasNextLine()){
            passlist = passlist + listScanner.nextLine();
        }
        listScanner.close();
        return passlist.contains(password.toLowerCase()); 
}

    public static boolean isvalid(String password, String passwordRequirements){
        Pattern pattern = Pattern.compile(passwordRequirements);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}