package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class MainPage extends BasePage {


    @FindBy(className = "createAnswerEmblem")
    private WebElement createPostButton;
    @FindBy(className = "homeEmblem")
    private WebElement homeButton;
    @FindBy(className = "logoutEmblem")
    private WebElement logoutButton;
    @FindBy(id = "dark")
    private WebElement darkBackground;
    @FindBy(id = "light")
    private WebElement lightBackground;
    @FindBy(xpath = "//button[@class='darkLightBtn']/img[@alt='moon']")
    private WebElement themeSwitchButton;
    @FindBy(id = "homeEmblem")
    private WebElement homePageButton;
    @FindBy(id = "createAnswerEmblem")
    private WebElement createNewPostButton;

    public MainPage(WebDriver driver, FluentWait<WebDriver> wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }


    public LoginPage logOut(){
        wait.until(ExpectedConditions.urlToBe("http://localhost:5173/"));
        logoutButton.click();
        return new LoginPage(driver, wait);
    }
}
