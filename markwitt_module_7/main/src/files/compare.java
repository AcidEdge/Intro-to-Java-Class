package files;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.*;


public class Compare {
 
    public static boolean comparison;
   /*  public static boolean commonPasswords(String password) throws IOException {
        File passListFile = new File("main/src/files/passwordlist.txt");
        String path = passListFile.getCanonicalPath();
        List<String> passwordsList = new ArrayList<>();
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null){
                passwordsList.add(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            if (br != null) {
                br.close();
            }
        }
        Pattern compare = Pattern.compile(password.toLowerCase());
        for(String word: passwordsList ){
            Matcher matcher1 = compare.matcher(word);
            if (matcher1.find()){
                comparison = true;
            }
            else {
                comparison = false;
            }
        }
        System.out.println("comparison matcher: " + comparison);
        return comparison;
    }
*/
static String passlist;
    public static boolean commonPasswords(String password) throws FileNotFoundException{

        File passListFile = new File("main/src/files/passwordlist.txt");
        Scanner listScanner = new Scanner(passListFile);
        while(listScanner.hasNextLine()){
            passlist = passlist + listScanner.nextLine();
        }
        listScanner.close();
        return passlist.contains(password);
        
}

    public static boolean isvalid(String password){
        String passwordRequirements = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,20}$"; 
        Pattern pattern = Pattern.compile(passwordRequirements);
        Matcher matcher = pattern.matcher(password);
        System.out.println("pattern matcher: " +matcher.matches());
        return matcher.matches();
    }

}