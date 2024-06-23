package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver = null;
    Wait<WebDriver> wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
    }

    public WebElement login() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/form/div[2]/div/label/img")));
    }

    public WebElement email() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identity\"]")));
    }

    public WebElement password() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    }

    public WebElement loginButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/form/button")));
    }

    public WebElement otpinput() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/main/div/form/div/input")));
    }

    public WebElement submitotpinput() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/main/div/form/div/button")));
    }

    public WebElement numberoflinceis() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"license_number\"]")));
    }

    public WebElement gender() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/form/div[1]/div/div/div[11]/div/input")));
    }

    public WebElement accept() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/div/form/div[1]/div/div/div[13]/div/div/div/div/input")));
    }

    public WebElement submit() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/div/form/div[2]/button")));
    }
}
