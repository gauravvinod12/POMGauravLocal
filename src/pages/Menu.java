package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
    //@FindBy (locator = value)
    //WebElement elementName;
    @FindBy(linkText="Dashboard") WebElement lnkDashboard;
    @FindBy (xpath="//span[contains(text(),'Clients')]") WebElement lnkClients;
    @FindBy (xpath="//a[contains(text(),'Add Client')]") WebElement lnkAddClient;
    @FindBy (xpath="//a[contains(text(),'View Clients')]") WebElement lnkViewClient;
    @FindBy (xpath="//span[contains(text(),'Quotes')]") WebElement lnkQuotes;
    @FindBy (xpath="//a[contains(text(),'Create Quote')]") WebElement lnkCreateQuote;
    @FindBy (xpath="//a[contains(text(),'View Quotes')]") WebElement lnkViewQuotes;

    //Now write constructor for the above statements, constructor is used to initialize an object
   // this constructor is used to initialise the page factory
    // now page factory will have the knowledge of the webDriver
    // it is associated with (e.g. chrome,firefox, safari etc)
    public Menu(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    //to click on above the link dashboard
    public void clickLnkDashboard()
    {
        lnkDashboard.click();
    }

    //clicks in sequence
    public void clickAddClient()
    {
        lnkClients.click();
        lnkAddClient.click();
    }

    public void clickViewClient()
    {
        lnkClients.click();
        lnkViewClient.click();
    }

    public void clickCreateQuotes()
    {
        lnkQuotes.click();
        lnkCreateQuote.click();
    }

    public void clickViewQuotes()
    {
        lnkQuotes.click();
        lnkViewQuotes.click();
    }

}
