package page.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Post extends BaseComponent {

    private final WebElement postUsername;
    private final WebElement descriptionUsername;
    private final WebElement meatBallMenu;
    private final WebElement heart;
    private final WebElement commentField;

    public Post(WebElement root) {
        super(root);
        this.commentField = root.findElement(By.name("comment"));
        this.postUsername = root.findElement(By.className("username"));
        this.descriptionUsername = root.findElement(By.className("descUser"));
        this.meatBallMenu = root.findElement(By.className("threeDot"));
        this.heart = root.findElement(By.className("heart"));
    }



}
