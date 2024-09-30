package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import page.LoginPage;
import page.SignUpPage;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected FluentWait<WebDriver> wait;
    protected SignUpPage signUpPage;
    protected LoginPage loginPage;

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
//        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        driver.manage().window().maximize();
        signUpPage = new SignUpPage(driver, wait);
        loginPage = new LoginPage(driver,wait);
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
