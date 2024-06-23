
package StepDefinitions.Login;

import POM.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static StepDefinitions.Home.Hooks.driver;

public class uploudpresidentmemberStepDefienetion {

    uploadmemberPage upload = new uploadmemberPage(driver);
    uploadpresidentmemberPage uploudpresident = new uploadpresidentmemberPage(driver);
    LoginPage login = new LoginPage(driver);
    Api api = new Api();
    int number;


    @When("user enter valid gmail GM4\"(.*)\"$")
    public void enterEmailGM4(String email) throws IOException, InterruptedException {
     Thread.sleep(4000);
       login.login().click();
       Thread.sleep(4000);
        login.email().sendKeys(email);
    }

    @And("user enter valid password GM4\"(.*)\"$")
    public void enterPassworGM4(String password) {
login.password().sendKeys(password);
    }

    @And("user click on login GM4")
    public void clickLoginButtonGM4() throws InterruptedException {
        login.loginButton().click();
        Thread.sleep(5000);
    }
    @And("user enter otp4")
    public void enterotp4() throws InterruptedException {
        Thread.sleep(5000);
        login.otpinput().click();
        login.otpinput().sendKeys("1234");
        login.submitotpinput().click();
    }
    @And("user upload member4")
    public void sendrequest4() throws InterruptedException {
        driver.navigate().to("http://dev.safa-dd.com/governance-clearance");
        Thread.sleep(4000);
        upload.tarhes().click();
        upload.tarhes().sendKeys("4460");
        upload.tarhes().sendKeys(Keys.ENTER);
        Thread.sleep(3000);

    }
    @And("user accept member4\"(.*)\"$")
    public void acceptrequest4(String morash) throws InterruptedException {
        System.out.println("Morash Value: " + morash);

        uploudpresident.morsheen().click(); // Assuming this clicks to open the dropdown
        Thread.sleep(2000); // Adjust the delay as needed to wait for the dropdown to open

        // You need to interact with the search field of the select2 dropdown
        WebElement searchField = driver.findElement(By.xpath("//span[@class='select2-search select2-search--inline']/textarea"));

        // Type the value '1007079831' into the search field
        searchField.sendKeys("1007079831");
        Thread.sleep(2000); // Adjust the delay as needed to wait for the search results to appear

        // Now, you may need to select the option from the dropdown list
        // Depending on how the options are displayed and selected in your application, you'll need to find and click the appropriate option
        // For example:
      searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000); // Adjust the delay as needed after selecting the option
        uploudpresident.uploudfile().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");
        Thread.sleep(2000); // Adjust the delay as needed after selecting the option

    }
    @And("user accept member5")
    public void acceptrequestper2() throws InterruptedException {

        uploudpresident.addperisdentmember().click();

        // You need to interact with the search field of the select2 dropdown
        WebElement searchField2 = driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[2]/td[1]/span/span[1]/span/span/textarea"));

        // Type the value '1007079831' into the search field
        searchField2.sendKeys("1056481177");
        Thread.sleep(2000); // Adjust the delay as needed to wait for the search results to appear

        // Now, you may need to select the option from the dropdown list
        // Depending on how the options are displayed and selected in your application, you'll need to find and click the appropriate option
        // For example:
        searchField2.sendKeys(Keys.ENTER);

        Thread.sleep(2000); // Adjust the delay as needed after selecting the option
        uploudpresident.uploudfile2().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");
        Thread.sleep(2000); // Adjust the delay as needed after selecting the option

    }
    @And("user accept member6")
    public void acceptrequestper3() throws InterruptedException {

        uploudpresident.addperisdentmember().click();

        // You need to interact with the search field of the select2 dropdown
        WebElement searchField3 = driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[3]/td[1]/span/span[1]/span/span/textarea"));

        // Type the value '1007079831' into the search field
        searchField3.sendKeys("1055668329");
        Thread.sleep(2000); // Adjust the delay as needed to wait for the search results to appear

        // Now, you may need to select the option from the dropdown list
        // Depending on how the options are displayed and selected in your application, you'll need to find and click the appropriate option
        // For example:
        searchField3.sendKeys(Keys.ENTER);

        Thread.sleep(2000); // Adjust the delay as needed after selecting the option
        uploudpresident.uploudfile3().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");
        Thread.sleep(2000); // Adjust the delay as needed after selecting the option

    }
    @And("user accept member7")
    public void acceptrequestper4() throws InterruptedException {

        uploudpresident.addperisdentmember().click();

        // You need to interact with the search field of the select2 dropdown
        WebElement searchField4 = driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[4]/td[1]/span/span[1]/span/span/textarea"));

        // Type the value '1007079831' into the search field
        searchField4.sendKeys("1071671836");
        Thread.sleep(2000); // Adjust the delay as needed to wait for the search results to appear

        // Now, you may need to select the option from the dropdown list
        // Depending on how the options are displayed and selected in your application, you'll need to find and click the appropriate option
        // For example:
        searchField4.sendKeys(Keys.ENTER);

        Thread.sleep(2000); // Adjust the delay as needed after selecting the option
        uploudpresident.uploudfile4().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");
        Thread.sleep(2000); // Adjust the delay as needed after selecting the option

    }
    @And("user accept member8")
    public void acceptrequestper5() throws InterruptedException {

        uploudpresident.addperisdentmember().click();

        // You need to interact with the search field of the select2 dropdown
        WebElement searchField4 = driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[5]/td[1]/span/span[1]/span/span/textarea"));

        // Type the value '1007079831' into the search field
        searchField4.sendKeys("1039770217");
        Thread.sleep(2000); // Adjust the delay as needed to wait for the search results to appear

        // Now, you may need to select the option from the dropdown list
        // Depending on how the options are displayed and selected in your application, you'll need to find and click the appropriate option
        // For example:
        searchField4.sendKeys(Keys.ENTER);

        Thread.sleep(2000); // Adjust the delay as needed after selecting the option
        uploudpresident.uploudfile5().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");
        Thread.sleep(2000); // Adjust the delay as needed after selecting the option

    }
    @And("user accept member9")
    public void acceptrequestper6() throws InterruptedException {

        uploudpresident.addperisdentmember().click();

        // You need to interact with the search field of the select2 dropdown
        WebElement searchField5 = driver.findElement(By.xpath("//*[@id=\"membersTable\"]/tbody/tr[6]/td[1]/span/span[1]/span/span/textarea"));

        // Type the value '1007079831' into the search field
        searchField5.sendKeys("1067769669");
        Thread.sleep(2000); // Adjust the delay as needed to wait for the search results to appear

        // Now, you may need to select the option from the dropdown list
        // Depending on how the options are displayed and selected in your application, you'll need to find and click the appropriate option
        // For example:
        searchField5.sendKeys(Keys.ENTER);

        Thread.sleep(2000); // Adjust the delay as needed after selecting the option
        uploudpresident.uploudfile6().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");
        Thread.sleep(2000); // Adjust the delay as needed after selecting the option
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,500)");
        uploudpresident.up1().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");
        uploudpresident.up2().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");
        uploudpresident.up3().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");

        uploudpresident.up4().sendKeys("/Users/amrashraf/IdeaProjects/demo_VG/src/files/test.pdf");
        Thread.sleep(2000); // Adjust the delay as needed after selecting the option
        uploudpresident.addrequest().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        String textContent = wait.until(ExpectedConditions.visibilityOf(uploudpresident.findtextpr())).getText();

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
    @And("user accept president")
    public void acceptrequest9() throws InterruptedException {
        driver.navigate().to("http://dev.safa-dd.com/admin/governance-clearance/show/" + number);

        upload.emailadmin().sendKeys("admin@ncnp.gov.sa");
        upload.passwordadmin().sendKeys("it2@gmail.com");
        upload.submitadmin().click();

        driver.navigate().to("http://dev.safa-dd.com/admin/governance-clearance/show/" + number);

        uploudpresident.first_step_elmash().click();
        Thread.sleep(3000);
        uploudpresident.pressok1().click();
        Thread.sleep(2000);
        uploudpresident.mashelamniy().click();
        Thread.sleep(2000);
        uploudpresident.pressok1().click();
        Thread.sleep(2000);
        uploudpresident.choose_elmash1().click();
        WebElement selectElement = uploudpresident.choose_elmash1();
        Select select = new Select(selectElement);
        select.selectByVisibleText("yes");
        Thread.sleep(2000);
uploudpresident.pressok().click();

        uploudpresident.choose_elmash2().click();
        WebElement selectElement2 = uploudpresident.choose_elmash2();
        Select select2 = new Select(selectElement2);
        select2.selectByVisibleText("yes");
        Thread.sleep(2000);
        uploudpresident.pressok().click();
        uploudpresident.choose_elmash3().click();
        WebElement selectElement3 = uploudpresident.choose_elmash3();
        Select select3 = new Select(selectElement3);
        select3.selectByVisibleText("yes");
        Thread.sleep(2000);
        uploudpresident.pressok().click();
        uploudpresident.choose_elmash4().click();
        WebElement selectElement4 = uploudpresident.choose_elmash4();
        Select select4 = new Select(selectElement4);
        select4.selectByVisibleText("yes");

        Thread.sleep(2000);
        uploudpresident.pressok().click();
        uploudpresident.choose_elmash5().click();
        WebElement selectElement5 = uploudpresident.choose_elmash5();
        Select select5 = new Select(selectElement5);
        select5.selectByVisibleText("yes");
        Thread.sleep(2000);
        uploudpresident.pressok().click();
        uploudpresident.choose_elmash6().click();
        WebElement selectElement6 = uploudpresident.choose_elmash6();
        Select select6 = new Select(selectElement6);
        select6.selectByVisibleText("yes");
        Thread.sleep(2000);
        uploudpresident.pressok().click();
        Thread.sleep(2000);

        uploudpresident.submitpresident().click();
    }



}
