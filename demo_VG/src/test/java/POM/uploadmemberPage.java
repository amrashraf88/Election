package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class uploadmemberPage {

    WebDriver driver = null;
    WebDriverWait wait = null;

    public uploadmemberPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Initializing WebDriverWait with a timeout of 20 seconds
    }

    // ... Other methods ...

    public WebElement tarhes() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/form/div/div[2]/input")));
    }

    public WebElement nextbutton() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/form/div/div[3]/button")));
    }

    public WebElement generalassimblyfees() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div/div/div/form/div[1]/div/div/div[1]/input")));
    }

    public WebElement nextstep() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div/div/div/div[3]/div/div/a[2]")));
    }

    public WebElement sendrequest() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div/div/div/form/div[3]/div/input")));
    }

    public WebElement nextrequest() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/input")));
    }

    public WebElement FINDTEXT() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.wrapper > div > div > div > div.register-block.mt-5 > div > div > div > p")));
    }

    public WebElement emailadmin() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[1]/input")));
    }

    public WebElement passwordadmin() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[2]/input")));
    }

    public WebElement submitadmin() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/section/div/div/div/div[1]/div/div[2]/form/button")));
    }

    public WebElement approvememberadmin() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/section/div/div[2]/div[1]/div/div/div[1]/button")));
    }
}
