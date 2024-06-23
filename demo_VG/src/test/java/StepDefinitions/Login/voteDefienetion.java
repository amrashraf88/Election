
package StepDefinitions.Login;

import POM.Api;
import POM.ElectionPage;
import POM.HomePage;
import POM.votingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static StepDefinitions.Home.Hooks.driver;

public class voteDefienetion {

    votingPage vote = new votingPage(driver);
    ElectionPage election = new ElectionPage(driver);
    Api api = new Api();



    @When("user login to election to vote\"(.*)\"$")
    public void vote(String user) throws IOException, InterruptedException {
     Thread.sleep(3000);
        driver.navigate().to("https://election.test.nawav2.safa-dd.com/voting/715");
        Thread.sleep(5000);

        election.electionemail().sendKeys(user);
       Thread.sleep(1000);
       election.electionlogin().click();
        Thread.sleep(6000);
//
//        JavascriptExecutor j = (JavascriptExecutor)driver;
//        j.executeScript("window.scrollBy(0,500)");
//        Thread.sleep(4000);
//        election.Startmeeting().click();
//        election.electionemail().sendKeys("1057529222");
//        election.electionlogin().click();
//        Thread.sleep(4000);
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.navigate().to("https://election.dev.nawav2.safa-dd.com/voting/4335");
//        Thread.sleep(6000);Thread.sleep(6000);
//        vote.startvotting().click();
//        Thread.sleep(6000);
        vote.chooseone().click();
        Thread.sleep(6000);
        vote.sendvoting().click();
        Thread.sleep(6000);
        vote.submitvoting().click();
    }

//

}
