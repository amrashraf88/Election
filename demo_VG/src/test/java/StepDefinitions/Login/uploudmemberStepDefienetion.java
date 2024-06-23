package StepDefinitions.Login;

import POM.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static StepDefinitions.Home.Hooks.driver;

public class uploudmemberStepDefienetion {

    uploadmemberPage upload = new uploadmemberPage(driver);
    acceptmemberPage accept = new acceptmemberPage(driver);
    LoginPage login = new LoginPage(driver);
    Api api = new Api();
    int number;

    @When("user enter valid gmail GM3\"(.*)\"$")
    public void enterEmailGM3(String email) throws IOException, InterruptedException {
        login.login().click();
        login.email().sendKeys(email);
    }

    @And("user enter valid password GM3\"(.*)\"$")
    public void enterPassworGM3(String password) {
        login.password().sendKeys(password);
    }

    @And("user click on login GM3")
    public void clickLoginButtonGM3() throws InterruptedException {
        login.loginButton().click();
    }

    @And("user enter otp3")
    public void enterotp3() throws InterruptedException {
        login.otpinput().click();
        login.otpinput().sendKeys("1234");
        login.submitotpinput().click();
    }

    @And("user upload member")
    public void sendrequest3() throws InterruptedException {
        driver.navigate().to("http://dev.safa-dd.com/general-assemblies");
        upload.tarhes().click();
        upload.tarhes().sendKeys("4460");
        upload.tarhes().sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        upload.generalassimblyfees().sendKeys("100");
        upload.nextrequest().click();

        JavascriptExecutor j = (JavascriptExecutor) driver;

        driver.navigate().to("http://dev.safa-dd.com/general-assemblies/attachments");
        j.executeScript("window.scrollBy(0,500)");
        j.executeScript("window.scrollBy(0,1500)");
        upload.sendrequest().click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        String textContent = wait.until(ExpectedConditions.visibilityOf(upload.FINDTEXT())).getText();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(textContent);

        if (matcher.find()) {
            String numericValue = matcher.group();
            try {
                number = Integer.parseInt(numericValue);
                System.out.println("The extracted number is: " + number);

                if (textContent.contains("تم استلام طلبكم رقم") && textContent.contains("بنجاح")) {
                    System.out.println("Confirmation message received successfully.");
                } else {
                    System.out.println("Unexpected confirmation message: " + textContent);
                }
            } catch (NumberFormatException e) {
                System.out.println("Failed to convert the extracted value to a number.");
                e.printStackTrace();
            }
        } else {
            System.out.println("No numeric value found in the text content.");
        }
    }

    @And("user accept member")
    public void acceptrequest3() throws InterruptedException {
        driver.navigate().to("http://dev.safa-dd.com/admin/general-assemblies/show/" + number);

        upload.emailadmin().sendKeys("admin@ncnp.gov.sa");
        upload.passwordadmin().sendKeys("it2@gmail.com");
        upload.submitadmin().click();

        driver.navigate().to("http://dev.safa-dd.com/admin/general-assemblies/show/" + number);
        upload.approvememberadmin().click();
    }
}
