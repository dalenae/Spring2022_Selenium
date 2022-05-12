import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashSet;

public class CodeTest2 {


    //Question 1 Verify feelsLike-temp value is in between the low-temp value and high-temp value
    WebDriver driver;
    @Test
    public void verifyingTemp() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.darksky.net/"); }


        //Question 2
        //Create a method to return factorial value of input-int-value
        public static int factorial(int n)
        {
            if (n == 0)
                return 1;

            return n*factorial(n-1);
        }


        //Question 3
        // Create a method to return the common Strings values in two input-String-arrays

        public HashSet set(String[] array1, String[] array2) {
            HashSet<String> set = new HashSet<String>();
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i].equals(array2[j])) {
                        set.add(array1[i]);
                    }}}
            return set; }


            //Question 4 Create method to find smallest positive
            static int findSmallestPositive(int arr[], int size)   {
                  int i;
        for (i = 0; i < size; i++) { int x = Math.abs(arr[i]);
        if (x - 1 < size && arr[x - 1] > 0)  arr[x - 1] = -arr[x - 1];
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
        return i + 1;}

        return size + 1; } }

