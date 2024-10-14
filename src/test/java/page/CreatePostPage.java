package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.nio.file.Path;


public class CreatePostPage extends BasePage {

        public CreatePostPage(WebDriver driver, FluentWait<WebDriver> wait) {
            super(driver, wait);
            PageFactory.initElements(driver, this);
        }

        @FindBy(id = "description")
        private WebElement descriptionField;
        @FindBy(xpath = "//button[text()='Create Post']")
        private WebElement createPostButton;
        @FindBy(xpath = "//button[text()='Cancel']")
        private WebElement cancelButton;


    public MainPage createNewPost(String description, Path path) {
        String absolutePath = path.toFile().getAbsolutePath();
        WebElement pictureUploadField = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']")));
        wait.until(ExpectedConditions.visibilityOf(descriptionField)).sendKeys(description);
        pictureUploadField.sendKeys(absolutePath);
        wait.until(ExpectedConditions.elementToBeClickable(createPostButton)).click();
        return new MainPage(driver, wait);
    }
}
