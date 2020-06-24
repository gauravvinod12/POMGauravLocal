//11june
package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login
{
    WebDriver driver;

    //*in Previous way*-> WebElement txtUser = driver.findElement(By.xpath("//input[@type='email']"));
    @FindBy (xpath = "//input[@type='email']")
    WebElement txtUser; // using page factory
    @FindBy (xpath = "//input[@type='password']")
    WebElement txtPassword;
    @FindBy (xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy (xpath = "//a[contains(text(),'I forgot my password')]")
    WebElement lnkForgotPass;

    // this constructor is used to initialise the page factory ,constructor is used to initialize an object
    // now page factory will have the knowledge of the webDriver
    // it is associated with (e.g. chrome,firefox, safari etc)
    public Login(WebDriver d)  // Login ob = new Login(drv) , eg-(argument as"WebDriver" variablename as "driver")
    {
        PageFactory.initElements(d,this); //intialisation of pagefactory
    }

    //To "click or enter" values of above Webelements seperate methods are created
    public void setTxtUser(String user)
    {
        txtUser.sendKeys(user);
    }
    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }
    public void clickBtnLogin()
    {
        btnLogin.click();
    }
    public  void clickForgotPassword()
    {
        lnkForgotPass.click();
    }
}
