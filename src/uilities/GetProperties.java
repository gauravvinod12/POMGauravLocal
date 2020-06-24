package uilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
// getting values of keys using properties files steps are given below in points
public class GetProperties {
    //public static returntype method()
    public static Properties getPropertyObject() throws IOException
    {
        // 1. Read the file (.properties)
        //FileInputStream "object"  = new FileInputStream (path of file);
        FileInputStream fp  = new FileInputStream("Resources\\InvoicePlane.properties");

        //2. Create object of properties class
        //why to create object of properties ?????
        Properties prop = new Properties();

        // 3. Load the file
        prop.load(fp);

        return prop;
    }

   /*
    public String getMyUrl() throws IOException {
        return  getPropertyObject().getProperty("url");
    }
    */

    public static String getMyUrl() throws IOException {
        Properties prp =  getPropertyObject();
        String myurl  =  prp.getProperty("url");
        return  myurl;
    }

    public static String getUsername() throws IOException {
        Properties prp =  getPropertyObject();
        String myurl  =  prp.getProperty("username");
        return  myurl;
    }
}
