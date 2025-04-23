package stepDefinition;

import Page.HomePage;
import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import org.junit.Assert;

import static Actions.Action.*;
import static Util.HighlightElement.highlightElement;
import static Util.WaitUntil.waitUntil;
import static org.junit.Assert.assertThat;

public class Login extends AbstractStepDef{

@SneakyThrows
@Given("user insert username")
    public void userInsertUsername(){
    navigate(loginPageUrl,driver);
    waitUntil(3);
    sendKey(loginPage.getUsernameField(),"Admin");

    }
    @And("user insert password")
    public void userInsertPassword() throws InterruptedException {

        sendKey(loginPage.getPasswordField(),"admin123");
        isDisplayed(loginPage.getLoginLogo());
        waitUntil(3);
      /*  click(loginPage.getFbLink(), 2);
        Thread.sleep(3000);
        sendKey(loginPage.getFbEmail(), "admin1");
        sendKey(loginPage.getFbPass(), "1234");
        click(loginPage.getFbSubmit(), 2);*/


    }
@When("user clicks on Login button")
    public void userClicksOnLoginButton(){
 click(loginPage.getSubmitButton(), 3);

}
@Then("user is redirect to homepage")
    public void userIsRedirectToHomepage() throws InterruptedException {
    waitUntil(3);
    highlightElement(homePage.getDashboardSign());
   Assert.assertEquals("Dashboard",homePage.getDashboardSign().getText());
}
@And("user clicks ob LogOut button")
public void userClickonLogonButton(){
 click(homePage.getUserMeniu(),1);
 waitUntil(5);
 click(homePage.getLogOut(),1);
}


}
