package page.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Post extends BaseComponent {

    private final WebElement postUsername;
    private final WebElement usernameAndDescription;
    private final WebElement meatBallMenu;
    private final WebElement heart;
    private final WebElement commentField;

    public Post(WebElement root) {
        super(root);
        this.commentField = root.findElement(By.name("comment"));
        this.postUsername = root.findElement(By.className("username"));
        this.usernameAndDescription = root.findElement(By.xpath(".//p[2]"));
        this.meatBallMenu = root.findElement(By.className("threeDot"));
        this.heart = root.findElement(By.className("heart"));
    }

    public String getDescription() {
        String fullText = usernameAndDescription.getText();
        return usernameAndDescription.getText().substring(fullText.indexOf(": ")+2);
    }
}
