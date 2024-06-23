package StepDefinitions.Login;

import POM.Api;
import POM.HomePage;
import POM.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static StepDefinitions.Home.Hooks.driver;

public class LoginGmailStepDefienetion {

    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    Api api = new Api();

    // Set implicit wait once at the beginning of your script
    static {
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
    }

    @When("user open login form")
    public void enterEmailGM() {
        login.login().click();
    }

    @And("user enter valid email GM\"(.*)\"$")
    public void enteremail(String email) throws InterruptedException {
        Thread.sleep(1000);
        login.email().click();
        login.email().sendKeys(email);
    }

    @And("user enter valid password GM\"(.*)\"$")
    public void enterPassworGM(String password) {
        login.password().sendKeys(password);
    }

    @And("user click on login GM")
    public void clickLoginButtonGM() {
        login.loginButton().click();
    }

    @And("user enter otp")
    public void enterotp() {
        login.otpinput().click();
        login.otpinput().sendKeys("1234");
        login.submitotpinput().click();
    }

    @And("user send request")
    public void sendrequest() throws InterruptedException {
        driver.navigate().to("https://es.stage.nawa-dd.com/nonprofits/members/requests/create");

        Select drpCountry = new Select(driver.findElement(By.name("register_type")));
        drpCountry.selectByVisibleText("طلب الانضمام لعضوية جمعية عمومية");
        Thread.sleep(1000);
     login.numberoflinceis().click();
        login.numberoflinceis().sendKeys("290");
        Select drpkind = new Select(driver.findElement(By.name("gender")));
        Thread.sleep(1000);
        drpkind.selectByVisibleText("ذكر");
        Select idkind = new Select(driver.findElement(By.name("type_identity")));
        Thread.sleep(1000);
        idkind.selectByVisibleText("هوية وطنية");
        Thread.sleep(1000);
        login.gender().sendKeys("29/09/1998");
        login.accept().click();
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();", login.submit());
    }
}
