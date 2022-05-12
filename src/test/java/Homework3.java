import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homework3 {

    //TC-1:  darksky.net
    //     * Verify correct temperature value is displayed after changing temperature units


    WebDriver driver;

    @Test
    public void verifyTemp() {

        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.darksky.com/");
        By findTempLocator = By.xpath("//*[@class='button'])[1]");
        WebElement findTemp = driver.findElement(findTempLocator);
        findTemp.click();
        driver.findElement(By.xpath("(//*[@data-index='1'])[1]")).click();
    }
//use assert.assertequals


    // TC-2: facebook.com
    //* Verify current date is selected in the dropdown when user lands on the Create new account form

    @Test
    public void checkCurrentDateNewAccount() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("(//*[@role = 'button'])[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String month = driver.findElement(By.id("month")).getText();
        String day = driver.findElement(By.id("day")).getText();
        String year = driver.findElement(By.id("year")).getText();

        Assert.assertEquals(month,"May","test failed");
        Assert.assertEquals(day,"10","test failed");
        Assert.assertEquals(year,"2022", "test failed");



    }








          //TC-3: https://classroomessentialsonline.com/
     // * Verify user lands on Economy Church Chairs page after clicking the option from Church Chairs















    }



























