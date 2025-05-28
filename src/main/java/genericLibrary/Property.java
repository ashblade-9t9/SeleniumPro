package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property implements AutoConstants{

    public static String getProperty(String key) throws IOException {

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(inputFile);

        p.load(fis);

        return p.getProperty(key);


    }




}
