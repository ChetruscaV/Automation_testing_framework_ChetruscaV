package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page{

    public RegisterPage(WebDriver driver){

        super(driver);
    }
    @FindBy(id="input-firstname")
    private WebElement firstNameInput;

    @FindBy(id="input-lastname")
    private WebElement lastNameInput;

    @FindBy(id="input-email")
    private WebElement emailInput;

    @FindBy(id="input-password")
    private WebElement passwordInput;

    @FindBy(id="input-newsletter-no")
    private WebElement subscribeRadioButton;

    @FindBy(xpath = "//*[@id=\"form-register\"]/div/div/div/input")
    private WebElement privacyCheckbox;

    @FindBy(id="8on83b")
    private WebElement continueButton;

public void fillInTheRegistrationForm(String firstName,String lastName,String email,String password){
    firstNameInput.sendKeys(firstName);
    lastNameInput.sendKeys(lastName);
    emailInput.sendKeys(email);
    passwordInput.sendKeys(password);
}

}
