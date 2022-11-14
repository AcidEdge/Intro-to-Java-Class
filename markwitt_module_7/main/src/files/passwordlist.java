/*Package for handling reading and adding to the common password list, passwordlist.txt
 * Method for reading common password list: showPasswordList
 * Method for adding to the common password list: addToPasswordList
 * Also includes a method for getting the passwordlist.txt file path used in both previous methods,
 * to help reduce code repitition.
 * There are no directions given to user on how to access these methods, 
 * so essentially these are "hidden" options
 */

//imports:
package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
 

public class PasswordList {
    //show common passwords method:
    public static void showPasswordList() throws IOException, InterruptedException {
        System.out.println("Current Common Password List:");
        //creates an array of strings and fills it with the passwords in the passwordlist.txt file
        List<String> passwordsList1 = new ArrayList<>();  
        BufferedReader br1 = null;
        try{
            br1 = new BufferedReader(new FileReader(getFilePath()));
            String line;
            while ((line = br1.readLine()) != null){
                passwordsList1.add("\n"+line);
            }
        }   //catches exception if there is an issue with the passwordlist.txt file
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            if (br1 != null) {
                br1.close();
            }
        }
        //display password list array, then give user 10 seconds to read output
        System.out.println(passwordsList1);
        TimeUnit.SECONDS.sleep(10);
        
        
     
    }
    //method to get passwordlist.txt filepath, used by both other methods in this package:
    public static String getFilePath() throws IOException {
        File passListFile = new File("main/src/files/passwordlist.txt");
        String path = passListFile.getCanonicalPath();
        return path;
    }
    //method for adding a new common password to the passwordlist.txt file:
    public static void addToPasswordList() throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter addToListWriter = new FileWriter(getFilePath(), true);  //create new writer object with filepath and append mode
        System.out.println("\n\nPlease enter new common password to add to banned list: ");
        addToListWriter.write("\n" + input.nextLine()); //adds user input to end of passwordlist.txt
        System.out.println( "Added to common passwords list. ");
        addToListWriter.close();    //close writer object
       
    }
}
