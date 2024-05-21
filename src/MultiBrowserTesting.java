import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {


    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        //Launch the Chrome Broswer
        WebDriver driver = new ChromeDriver();
        //Open the Url
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println(driver.getTitle());
        //Print Curent Url
        System.out.println(driver.getCurrentUrl());
        // Print page source
        System.out.println(driver.getPageSource());
        //Enter the Email to email field
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        //Enter password to password field
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //click on login button
        driver.findElement(By.name("login-button")).click();
        //print the current Url
        System.out.println(driver.getCurrentUrl());
        //Navigate to base Url
        driver.navigate().to(baseUrl);
        //refresh the page
        driver.navigate().refresh();

    }
}
