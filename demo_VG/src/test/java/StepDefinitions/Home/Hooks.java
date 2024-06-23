package StepDefinitions.Home;

import POM.Api;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;
Api api = new Api();
    @Before
	public void openBrowser() throws InterruptedException {

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        try {
            // Navigate to the specified URL
            driver.navigate().to("https://es.stage.nawa-dd.com/login");

            // Your dev logic goes here

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    

    @After
    public static void closeBrowser()
    {
        try{
            Thread.sleep(2000);
            driver.quit();
        }catch (NullPointerException e) {
            System.out.println("NullPointerException Thrown!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
