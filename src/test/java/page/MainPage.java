package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import page.component.Post;

import java.util.List;
import java.util.Optional;

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

    public MainPage(WebDriver driver, FluentWait<WebDriver> wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }


    public LoginPage logOut() {
        wait.until(ExpectedConditions.urlToBe("http://localhost:5173/"));
        logoutButton.click();
        return new LoginPage(driver, wait);
    }

    public CreatePostPage createPost() {
        wait.until(ExpectedConditions.urlToBe("http://localhost:5173/"));
        createPostButton.click();
        return new CreatePostPage(driver, wait);
    }

    public List<Post> getPosts() {
        List<Post> posts;
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("homeFeed"))));
            posts = driver.findElements(By.xpath("//section//div[@class='onePost']")).stream().map(Post::new).toList();
        return posts;
    }

    public Optional<Post> getPostByDescription(String description) {
        return getPosts()
                .stream()
                .filter(post -> post.getDescription()
                        .equals(description)).findFirst();
    }
}
