package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElectionPage {

    WebDriver driver = null;

    public ElectionPage(WebDriver driver)
    {
        this.driver = driver;
    }
//

    public WebElement Startmeeting()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/section/section/section[2]/div/div[2]/div/div/div[3]/div/button"));
    }
    public WebElement acceptterms()
    {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[2]/div[3]/div/input"));
//        return driver.findElement(By.cssSelector("input[type='checkbox']"));
    }
    public WebElement nextstep()
    {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div/button"));
    }

    public WebElement meetingdata()
    {
        return driver.findElement(By.xpath("//*[@id=\"baseInput\"]"));
    }
    public WebElement meetingtime()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[4]/div[1]/div/div/input"));
    }

    public WebElement starttime()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[1]/span/input"));
    }
    public WebElement endtime()
    {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[3]/span/input"));
    }

    public WebElement meetinglocation()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/section[2]/div/input"));
    }

    public WebElement meetingleader()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[6]/div"));
    }

    public WebElement electionemail()
    {
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/div[3]/section/section/div[1]/input"));
    }

    public WebElement electionlogin()
    {
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/div[3]/section/section/button"));
    }
}
