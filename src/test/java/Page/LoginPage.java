package Page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class LoginPage extends AbstractPage{
    @FindBy(name="username")
    private WebElement usernameField;

    @FindBy(name ="password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//p[text()='Time at Work']")
    private WebElement timeAtWorkText;

    @FindBy(xpath = "//p[text()='Invalid credentials']")
   private WebElement invalidCredentials;

    @FindBy(xpath= "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    private WebElement loginLogo;

    @FindBy(xpath="//div[@class='orangehrm-login-footer-sm']//a[2]")
    private WebElement fbLink;

  /*  @FindBy(xpath = "(//input[@name='email'])[2]")
    private WebElement fbEmail;

    @FindBy(xpath = "(//input[@name='pass'])[2]")
    private WebElement fbPass;

    @FindBy(xpath = "(//div[@role='button'])[12]")
    private WebElement fbSubmit;*/


    public LoginPage(WebDriver driver){
        super(driver);
    }



}
