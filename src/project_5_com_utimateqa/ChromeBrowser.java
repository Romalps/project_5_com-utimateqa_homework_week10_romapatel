package project_5_com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
Project-5 - Project Name: com-utimateqa
BaseUrl =
https://courses.ultimateqa.com/users/sign_in
1. Setup chrome browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field
8. Close the browser
 */
public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl ="https://courses.ultimateqa.com/users/sign_in";
        //Launch the chrome driver
        WebDriver driver= new ChromeDriver();
        // Open the URL into browser
        driver.get(baseUrl);
        //Maximise the browser
        driver.manage().window().maximize();
        // Give implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the Page
        String title= driver.getTitle();
        System.out.println(title);
        // Get the Current URL
        System.out.println("Current URL : "+driver.getCurrentUrl());
        //Get the Page source
        System.out.println("Page source : "+ driver.getPageSource());
        // Find and enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gamil.com");
        // Find and enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("Prime123");

        // closing the browser
        driver.close();








    }
}
