package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class votingPage {

    WebDriver driver = null;

    public votingPage(WebDriver driver)
    {
        this.driver = driver;
    }
//

    public WebElement startvotting()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/section/section/div/div[3]/div/div/div[3]/div/button"));
    }
    public WebElement chooseone()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div[1]/span"));
    }
    public WebElement choosetwo()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[3]/div[1]/div[2]/div/div[3]/div[1]/span"));
    }
    public WebElement sendvoting()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div[2]/button"));
    }
    public WebElement submitvoting()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div/button"));
    }

}