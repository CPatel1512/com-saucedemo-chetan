import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBroserTesting {

    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        //Set up Browser
        WebDriver driver = new ChromeDriver();
        //Open Url
        driver.get(baseUrl);
    //Print the title of the page
        System.out.println(driver.getTitle());
        //Print the current Url
        System.out.println(driver.getCurrentUrl());
        // Print page source
        System.out.println(driver.getPageSource());
        //Enter email Id to email id field
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Enter password to password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Action on login Button
        driver.findElement(By.id("login-button")).click();
        System.out.println(driver.getCurrentUrl());
        //Navigate to baseUrl
        driver.navigate().to(baseUrl);
        //Refresh the page
        driver.navigate().refresh();
        //Close the browser
        driver.close();


    }
}
