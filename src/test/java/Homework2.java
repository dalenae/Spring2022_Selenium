import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework2 {
    /**
     * Testcase-1:
     * Verify "Keep me signed in" is NOT selected for messenger login page
     *
     * Click "Log in" button
     *
     * Verify "Incorrect email or phone number" is displayed
     *
     * Verify "Continue" button is enabled
     */
    WebDriver driver;
     @Test
    public void messengerVerification()  {
         System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.messenger.com/");

         // Following if block will close ad on messenger landing page
         if (driver.findElement(By.xpath("//div[@id='close']")).isDisplayed()){
             WebElement ad = driver.findElement(By.xpath("//div[@id='close']"));
             ad.click();
         }

         By signedInLocator = By.xpath("//*[@class='_2qcu']");
         WebElement checkboxSelected = driver.findElement(signedInLocator);
         boolean isSelected = checkboxSelected.isSelected();
         Assert.assertFalse(isSelected, "Test failed because box was checked");
         //Assert.assertTrue();
         //Assert.assertEquals(expectedValue,actualValue,Message);


         By clickLoginBtnLocator = By.id("loginbutton");
         WebElement clickLoginBtn = driver.findElement(clickLoginBtnLocator);
         clickLoginBtn.click();

         // keep this in method to access when u need.
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         // driver.findElement(By.id("loginbutton")).click();

         By isErrorMessageDisLoc = By.xpath("(//form/div)[1]");
         WebElement isErrorMessageDis = driver.findElement(isErrorMessageDisLoc);
         boolean isDisplayed = isErrorMessageDis.isDisplayed();
         Assert.assertTrue(isDisplayed,"Test Failed");

         By isContinueLocator = By.xpath("//button[@id= 'loginbutton']");
         WebElement isContinueEnabled = driver.findElement(isContinueLocator);
         boolean isEnabled = isContinueEnabled.isEnabled();
         Assert.assertTrue(isEnabled, "Test Failed");

         // very last step, just to close your browser window
         driver.quit();
     }

   /* Testcase-2:
     On Create new account page:
    Verify the "Sign Up" button is enabled when user lands on the form
             * Enter the below details in Sign Up form EXCEPT DOB
     * First name
     * Last name
     * email
     * re-enter email
     * new password
     * click Sign Up
     *
     * Verify "Please choose a gender. You can change who can see this later." is displayed */
     @Test
    public void createNewAccountPage() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("(//*[@role = 'button'])[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[text() = 'Sign Up']")).isEnabled();
        boolean isItEnabled = driver.findElement(By.xpath("//button[text() = 'Sign Up']")).isEnabled();
        Assert.assertTrue(isItEnabled,"Testcase failed button is not enabled");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dalena");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Eyasu");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("dalenatechno@yahoo.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("dalenatechno@yahoo.com");
        driver.findElement(By.xpath("(//input[@ type ='password'])[2]")).sendKeys("technosoft");
        driver.findElement(By.xpath("//button[text() = 'Sign Up']")).click();
        boolean isDisplayed= driver.findElement(By.id("js_ex")).isDisplayed();
        Assert.assertTrue(isDisplayed,"Testcase failed button is not displayed");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();

            driver.quit();
        }
// Testcase3 - 3

    }



}
