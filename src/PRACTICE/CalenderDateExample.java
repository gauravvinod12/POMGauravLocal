package PRACTICE;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import uilities.Drivers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static uilities.Drivers.getDriver;
//https://vimeo.com/429171896
public class CalenderDateExample
{
    public static void main(String[] args) throws ParseException {
        WebDriver driver = getDriver(Drivers.DriverTypes.CHROME);
        driver.get("https://jqueryui.com/datepicker/");
        WebElement iframe = driver.findElement(By.className("demo-frame")); // to find the frame first named demo-frame
        driver.switchTo().frame(iframe);                            //switch frame is used cause that calender is on other frame sometimes its is not choosen hence this
        driver.findElement(By.id("datepicker")).click();

        //-> For SETTING MONTH
        String setDateStr = "01/12/2020";                          //this is a string
        SimpleDateFormat sdSetDate = new SimpleDateFormat("dd/MM/yyyy"); // to convert the string into date format
        Date setDate = sdSetDate.parse(setDateStr);                     //parse the string to convert in date fromat

        //-> MMMM yyyy for CURRENT DATE from the date picker
        String currtdateStr = driver.findElement(By.className("ui-datepicker-year")).getText();//gets date on text format
        System.out.println(currtdateStr);
        //-> now convert the currdate text in respective format
        Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currtdateStr);

        //-> NOW to FIND DIFFERENCE between the above DATES set - current date and download the jar file for it to work ( https://jar-download.com/artifacts/joda-time/joda-time/2.9.4/source-code )
        int monthDiff = Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1), new DateTime(setDate).withDayOfMonth(1)).getMonths();//diff between 1st day of the months
        System.out.println(monthDiff);

        //-> Now to click on the arrow left or right
        boolean monthDiffStatus = false ;              //take a flag to check month diff is positive or not, flag is just variable,by deafault keep it as false
        if (monthDiff > 0)                        // if month diff is greater than 0  the flag is true or positive
            monthDiffStatus = true;
        for (int i = 0; i < monthDiff; i++)
        {
            if (monthDiffStatus)
                driver.findElement(By.xpath("//span[text()='Next']")).click();      //if true then click on next button
            else                                                                //else it is false and print the respective
                driver.findElement(By.xpath("//span[text()='Prev']")).click();      //if false the click previous button
        }

        //-> FOR SETTING DATE
        String setDaystr = new SimpleDateFormat("dd").format(setDate);     //convert date to string
        System.out.println(setDateStr);

        //-> Cause for single digit dates like "2" it will take "02" hence convert "02" in interger like "2"
        int setDatInt = Integer.parseInt(setDateStr);                             //convert in integer using wrapper class

        System.out.println(setDatInt);
        driver.findElement(By.xpath("//a[text()='" +setDateStr+ "']")).click();
    }
}
