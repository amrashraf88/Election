package StepDefinitions.Login;

import POM.Api;
import POM.HomePage;
import POM.LoginPage;
import POM.acceptmemberPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static StepDefinitions.Home.Hooks.driver;

public class acceptmemberStepDefienetion {

    HomePage home = new HomePage(driver);
    acceptmemberPage accept = new acceptmemberPage(driver);
    LoginPage login = new LoginPage(driver);
    Api api = new Api();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    @When("user enter valid gmail GM2\"(.*)\"$")
    public void enterEmailGM(String email) throws IOException, InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(login.login())).click();
        wait.until(ExpectedConditions.visibilityOf(login.email())).sendKeys(email);
    }

    @And("user enter valid password GM2\"(.*)\"$")
    public void enterPassworGM(String password) {
        wait.until(ExpectedConditions.visibilityOf(login.password())).sendKeys(password);
    }

    @And("user click on login GM2")
    public void clickLoginButtonGM() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(login.loginButton())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id"))); // Adjust this line based on the loading indicator of your application
    }

    @And("user enter otp2")
    public void enterotp() {
        wait.until(ExpectedConditions.elementToBeClickable(login.otpinput())).click();
        wait.until(ExpectedConditions.visibilityOf(login.otpinput())).sendKeys("1234");
        wait.until(ExpectedConditions.elementToBeClickable(login.submitotpinput())).click();
    }

    @And("user accept member 1")
    public void sendrequest() throws InterruptedException {
        Thread.sleep(1500);
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails1())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id"))); // Adjust this line based on the loading indicator of your application
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
            wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");
            wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        }catch (Exception e){
            driver.navigate().back();
        } // Adjust this line based on the loading indicator of your application
    }
    @And("user accept member 2")
    public void sendrequest2() throws InterruptedException {
        Thread.sleep(1500);
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails2())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
            wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");

            wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        }catch (Exception e){
            driver.navigate().back();
        }


    }

    @And("user accept member 3")
    public void sendrequest3() throws InterruptedException {
        Thread.sleep(1500);
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails3())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");

   try {      
       wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
       wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");
       wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
    }catch (Exception e){
        driver.navigate().back();
    }
    }
    // Repeat the pattern for other memberdetails methods and user accept member steps...
    @And("user accept member 4")
    public void sendrequest4() throws InterruptedException {
        Thread.sleep(1500);
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails4())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
            wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");
            wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        }catch (Exception e){
            driver.navigate().back();
        }

    }

    @And("user accept member 5")
    public void sendrequest5() throws InterruptedException {
        Thread.sleep(1500);
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails5())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
            wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");
            wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        }catch (Exception e){
            driver.navigate().back();
        }
    }
    @And("user accept member 6")
    public void sendrequest6() throws InterruptedException {
        Thread.sleep(1500);
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails6())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
            wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");
            wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        }catch (Exception e){
            driver.navigate().back();
        }
    }

    @And("user accept member 7")
    public void sendrequest7() throws InterruptedException {
        Thread.sleep(1500);
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails7())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
            wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");
            wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        }catch (Exception e){
            driver.navigate().back();
        }
    }

    @And("user accept member 8")
    public void sendrequest8() throws InterruptedException {
        Thread.sleep(1500);
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails8())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
            wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");
            wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        }catch (Exception e){
            driver.navigate().back();
        }
    }

    @And("user accept member 9")
    public void sendrequest9() throws InterruptedException {
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails9())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
            wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");
            wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        }catch (Exception e){
            driver.navigate().back();
        }
    }

    @And("user accept member 10")
    public void sendrequest10() throws InterruptedException {
        Thread.sleep(1500);
        driver.navigate().to("https://es.stage.nawa-dd.com/user/nonprofits/284/members/requests");
        wait.until(ExpectedConditions.visibilityOf(accept.memberdetails10())).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(accept.acceptbutton())).click();
            wait.until(ExpectedConditions.visibilityOf(accept.dataaccept())).sendKeys("29/09/2023");
            wait.until(ExpectedConditions.elementToBeClickable(accept.submittdata())).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("some_loading_spinner_id")));
        }catch (Exception e){
            driver.navigate().back();
        }
    }
}


