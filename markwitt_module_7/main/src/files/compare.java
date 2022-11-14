package files;


import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;


public class compare {
    public static boolean comparison;
    public static boolean commonPasswords(String password) throws IOException {
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

    public static boolean isvalid(String password, String passwordRequirements){
        Pattern pattern = Pattern.compile(passwordRequirements);
        Matcher matcher = pattern.matcher(password);
        System.out.println("pattern matcher: " +matcher.matches());
        return matcher.matches();
    }

}