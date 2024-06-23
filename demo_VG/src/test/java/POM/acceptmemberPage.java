package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class acceptmemberPage {

    WebDriver driver = null;
    WebDriverWait wait;

    public acceptmemberPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public WebElement memberdetails1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[1]/td[7]/div/ul/li/a")));
    }

    public WebElement memberdetails2() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[2]/td[7]/div/ul/li/a")));
    }

    public WebElement memberdetails3() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[3]/td[7]/div/ul/li/a")));
    }
// ... Repeat the pattern for other memberdetails methods ...

    public WebElement memberdetails4() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[4]/td[7]/div/ul/li/a")));
    }

    public WebElement memberdetails5() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[5]/td[7]/div/ul/li/a")));
    }

    public WebElement memberdetails6() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[6]/td[7]/div/ul/li/a")));
    }

    public WebElement memberdetails7() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[7]/td[7]/div/ul/li/a")));
    }

    public WebElement memberdetails8() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[8]/td[7]/div/ul/li/a")));
    }

    public WebElement memberdetails9() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[9]/td[7]/div/ul/li/a")));
    }

    public WebElement memberdetails10() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div[2]/div/table/tbody/tr[10]/td[7]/div/ul/li/a")));
    }


    public WebElement acceptbutton() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/main/div/div/div/div[2]/div/div/table/tbody/tr[10]/td[2]/div/ul/button[1]")));
    }

    public WebElement dataaccept() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"join_date\"]")));
    }

    public WebElement submittdata() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div[3]/button[1]")));
    }

    public WebElement closerdata() {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[3]/button[1]")));
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
