package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SignUpPage extends BasePage {
    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[text() = 'Create an account']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[text() = 'Log in']")
    private WebElement logInButton;

    public SignUpPage(WebDriver driver, FluentWait<WebDriver> wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    public LoginPage register(String firstName, String lastName, String username, String email, String password) {
        wait.until(ExpectedConditions.urlContains("signup"));
        wait.until(ExpectedConditions.visibilityOf(this.firstName)).sendKeys(firstName);
        wait.until(ExpectedConditions.visibilityOf(this.lastName)).sendKeys(lastName);
        wait.until(ExpectedConditions.visibilityOf(this.username)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(this.email)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(this.password)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(this.submitButton)).click();
        return new LoginPage(driver, wait);
    }
}
