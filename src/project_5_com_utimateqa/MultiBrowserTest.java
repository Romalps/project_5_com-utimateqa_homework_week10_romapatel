package project_5_com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static String browser = "FireFox";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //Open the URL
        driver.get(baseUrl);
        //Maximise the browser window
        driver.manage().window().maximize();
        //Give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title : " + title);
        // Get the current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //Get the Page source
        System.out.println("Page source : " + driver.getPageSource());
        // Find and enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com");
        //Find and enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("Prime123");

        //closing browser
        driver.close();
    }

}
