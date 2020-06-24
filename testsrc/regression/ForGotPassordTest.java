package regression;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.ForgotPassword;
import pages.Login;
import uilities.Drivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static uilities.Drivers.getDriver;
import static uilities.GetProperties.getMyUrl;
import static uilities.GetProperties.getUsername;

public class ForGotPassordTest {
    WebDriver driver = getDriver(Drivers.DriverTypes.CHROME);
    @Test
    public void forgotPasswordTest() throws IOException {

     /*  how to get url from utilites GetProperties, better way to type this code seperately in Utilties
     // 1. read the file (.properties)
        FileInputStream fp  = new FileInputStream("Resources\\InvoicePlane.properties");
        //2. create object of properties class
        Properties prop = new Properties();
       // 3. load the file
        prop.load(fp);
        //4. get the key value for properties
        String myUrl = prop.getProperty("url");
*/

        String myUrl = getMyUrl(); // creating object for class"getMyUrl"
        driver.get(myUrl);         //calling the object

        Login login = new Login(driver);
        login.clickForgotPassword();

        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.setTxtEmail(getUsername());
        forgotPassword.clickBtnReset();
    }
}
