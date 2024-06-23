
package StepDefinitions.Login;

import POM.Api;
import POM.ElectionPage;
import POM.HomePage;
import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static StepDefinitions.Home.Hooks.driver;

public class electionDefienetion {

    HomePage home = new HomePage(driver);
    ElectionPage election = new ElectionPage(driver);
    Api api = new Api();



    @When("user login to election")
    public void loginelection() throws IOException, InterruptedException {
     Thread.sleep(3000);
        driver.navigate().to("https://election.edev.safa-dd.com/boardOfDirectorsElectionService/3701");
        Thread.sleep(9000);

        election.electionemail().sendKeys("1023411380");
       Thread.sleep(1000);
       election.electionlogin().click();
        Thread.sleep(6000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://election.edev.safa-dd.com/boardOfDirectorsElectionService/3701");
        Thread.sleep(4000);
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,500)");
        Thread.sleep(4000);
        election.Startmeeting().click();
//        election.electionemail().sendKeys("1057529222");
//        election.electionlogin().click();
//        Thread.sleep(4000);

    }

    @And("user accept terms")
    public void acceptTerms() throws InterruptedException {

    }


}
