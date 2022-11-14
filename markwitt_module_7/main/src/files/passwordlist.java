package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class passwordlist {
    public static void secretMenu() throws IOException {
        System.out.println("you found the secret menu!");
        File passListFile = new File("main/src/files/passwordlist.txt");
        String path = passListFile.getCanonicalPath();
        List<String> passwordsList1 = new ArrayList<>();
        BufferedReader br1 = null;
        try{
            br1 = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br1.readLine()) != null){
                passwordsList1.add("\n"+line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            if (br1 != null) {
                br1.close();
            }
        }
        System.out.println(passwordsList1);
        System.exit(0);
        // add menu for reading password list and updating password list.
    }
}
