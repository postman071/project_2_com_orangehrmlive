package BrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SingleBrowser
{
    public static void main(String[] args)
    {        String baseUrl="https://opensource-demo.orangehrmlive.com/";


        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open URL into Browser
        driver.get(baseUrl);
        // Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the Title of the page
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
        //Close the browser
        driver.close();
    }
}
