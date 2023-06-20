package BrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting
{
    static String browser="Chrome";

    static String baseUrl="https://opensource-demo.orangehrmlive.com/";

    static WebDriver driver;          // Driver Declaration or Global Declaration

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver =new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver =new EdgeDriver();

        }else{
            System.out.println("Wrong Browser name");
        }
        //Open URL into the Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        //We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the Title of the Page
        String Title= driver.getTitle();
        System.out.println("Print the Title"  +Title);
        //Print the current URL
        System.out.println("Current URL:" +driver.getCurrentUrl());
        //Print the page source
        String pageSource= driver.getPageSource();
        System.out.println("Page Source" +driver.getPageSource());
        //Enter the Username field name Username
        driver.findElement(By.name("username")).sendKeys("Admin123@gmail");
        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Close the Browser
        driver.close();
    }
}
