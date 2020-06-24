package utilites;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import pages.Login;
import uilities.Drivers;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import static uilities.Drivers.getDriver;

//since we are using the annotations related to tests we are putting this class in test src
public class DoLogin // how to create for firefox ????????????????????
{
    protected WebDriver driver = getDriver(Drivers.DriverTypes.CHROME); //find the source in utilities Drivers, driver is a datamember
   //driver was a default member which cannot be accessed publicly in AddClient hence you make it public or protected to access in other flies

    @BeforeClass // this forces doLogin to run before every class
    public void doLogin()
    {
        String myUrl ="";

        ResourceBundle rb = ResourceBundle.getBundle("InvoicePlane"); //use resource bundle
        myUrl= rb.getString("url");

        driver.get(myUrl);

        Login login = new Login(driver);

        login.setTxtUser("amolujagare@gmail.com");
        login.setTxtPassword("admin123");
        login.clickBtnLogin();

        driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
    }
}
