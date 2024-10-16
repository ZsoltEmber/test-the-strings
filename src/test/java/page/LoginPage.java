package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import test.TestUser;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement loginButton;

    @FindBy(className = "google")
    private WebElement loginWithGoogleButton;

    @FindBy(className = "linkToSignOrLogin")
    private WebElement signUpButton;

    public LoginPage(WebDriver driver, FluentWait<WebDriver> wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);

    }

    public MainPage login(String username, String password) {
        driver.get("http://localhost:5173/login");
        wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        loginButton.click();
        return new MainPage(driver, wait);
    }

    public MainPage login(TestUser testUser) {
        driver.get("http://localhost:5173/login");
        wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(testUser.getUsername());
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(testUser.getPassword());
        loginButton.click();
        return new MainPage(driver, wait);
    }

    public void clickOnGoogleButton() {
        wait.until(ExpectedConditions.visibilityOf(loginWithGoogleButton));
        loginWithGoogleButton.click();
    }

    public void clickOnSignUpButton() {
        wait.until(ExpectedConditions.visibilityOf(signUpButton));
        signUpButton.click();
    }



}
