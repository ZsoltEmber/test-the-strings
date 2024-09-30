package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentials() {
        TestUser testUser = new TestUser("Test", "User", "test-user", "password");
        signUpPage.register(testUser).login(testUser);
        wait.until(ExpectedConditions.urlToBe("http://localhost:5173/"));
        assertEquals("http://localhost:5173/", driver.getCurrentUrl());
    }

    @Test
    public void loginWithInvalidCredentials() {
        loginPage.login("invalidTestUser", "password");
        assertEquals("http://localhost:5173/login", driver.getCurrentUrl());
    }

    @Test
    public void logOut(){
        TestUser testUser = new TestUser("Test", "User", "test-user", "password");
        loginPage = signUpPage.register(testUser).login(testUser).logOut();
        assertEquals("http://localhost:5173/login", driver.getCurrentUrl());
    }

}
