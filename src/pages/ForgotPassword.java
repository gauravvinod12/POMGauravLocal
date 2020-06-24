package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

    @FindBy(xpath = "//input[@id='email']")
    WebElement txtEmail;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement btnReset;

    // this constructor is used to initialise the page factory ,constructor is used to initialize an object
    // now page factory will have the knowledge of the webDriver
    // it is associated with (e.g. chrome,firefox, safari etc)
    public ForgotPassword(WebDriver driver) //parameterised constructor read, eg-(datatype variablename)
    {
        PageFactory.initElements(driver,this);
    }

    public void setTxtEmail(String email)
    {
        txtEmail.sendKeys(email);
    }
    public void clickBtnReset()
    {
        btnReset.click();
    }
}
