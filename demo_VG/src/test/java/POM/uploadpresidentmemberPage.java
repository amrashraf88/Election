package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class uploadpresidentmemberPage {

    WebDriver driver = null;

    public uploadpresidentmemberPage(WebDriver driver)
    {
        this.driver = driver;
    }
//

    public WebElement morsheen()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div/div/div/div[3]/form/div[1]/div/table/tbody/tr/td[1]/span/span[1]/span"));
    }
    public WebElement uploudfile()
    {
        return driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[1]/td[6]/input"));
    }
    public WebElement addperisdentmember()
    {
        return driver.findElement(By.xpath("//*[@id=\"add-member\"]"));
    }
    public WebElement uploudfile2()
    {
        return driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[2]/td[6]/input"));
    }
    public WebElement uploudfile3()
    {
        return driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[3]/td[6]/input"));
    }
    public WebElement uploudfile4()
    {
        return driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[4]/td[6]/input"));
    }
    public WebElement uploudfile5()
    {
        return driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[5]/td[6]/input"));
    }
    public WebElement uploudfile6()
    {
        return driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[6]/td[6]/input"));
    }

    public WebElement addrequest()
    {
        return driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    }

//body > div.wrapper > div > div > div > div.register-block.mt-5 > div > div > div > p
public WebElement FINDTEXT()
        {
        return driver.findElement(By.cssSelector("body > div.wrapper > div > div > div > div.register-block.mt-5 > div > div > div > p"));
        }

    public WebElement emailadmin()
    {
        return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[1]/input"));
    }
    public WebElement passwordadmin()
    {
        return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/section/div/div/div/div[1]/div/div[2]/form/div[2]/input"));
    }

    public WebElement submitadmin()
    {
        return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/section/div/div/div/div[1]/div/div[2]/form/button"));
    }

    public WebElement approvememberadmin()
    {
        return driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/section/div/div[2]/div[1]/div/div/div[1]/button"));
    }
    //*[@id="form"]/div[2]/div[1]/div/input
    public WebElement up1()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div[1]/div/input"));
    }
    public WebElement up2()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div[2]/div/input"));
    }
    public WebElement up3()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div[3]/div/input"));
    }
    public WebElement up4()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div[4]/div/input"));
    }
    public WebElement mashelamniy()
    {
        return driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/section/div/div[2]/div[1]/div/div/div[1]/button"));
    }

    public WebElement choose_elmash1()
    {
        return driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/section/div/div[1]/div[1]/div/div[3]/div/div/div/table[2]/tbody/tr[1]/td[6]/select"));
    }
    public WebElement choose_elmash2()
    {
        return driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/section/div/div[1]/div[1]/div/div[3]/div/div/div/table[2]/tbody/tr[2]/td[6]/select"));
    }
    public WebElement choose_elmash3()
    {
        return driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/section/div/div[1]/div[1]/div/div[3]/div/div/div/table[2]/tbody/tr[3]/td[6]/select"));
    }
    public WebElement choose_elmash4()
    {
        return driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/section/div/div[1]/div[1]/div/div[3]/div/div/div/table[2]/tbody/tr[4]/td[6]/select"));
    }
    public WebElement choose_elmash5()
    {
        return driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/section/div/div[1]/div[1]/div/div[3]/div/div/div/table[2]/tbody/tr[5]/td[6]/select"));
    }
    public WebElement choose_elmash6()
    {
        return driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/section/div/div[1]/div[1]/div/div[3]/div/div/div/table[2]/tbody/tr[6]/td[6]/select"));
    }

    public WebElement first_step_elmash()
    {
        return driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/section/div/div[2]/div[1]/div/div/div[1]/button"));
    }


    public WebElement pressok()
    {
        return driver.findElement(By.xpath("/html/body/div[14]/div/div[3]/button[1]"));
    }
    public WebElement pressok1()
    {
        return driver.findElement(By.xpath("/html/body/div[12]/div/div[3]/button[1]"));
    }
    public WebElement submitpresident()
    {
        return driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/section/div/div[2]/div[1]/div/div/div[1]/button"));
    }

    public WebElement findtextpr()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div/p"));
    }
}
