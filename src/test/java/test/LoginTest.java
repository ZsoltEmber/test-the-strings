package test;

import org.junit.jupiter.api.Test;
import page.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentials() {
        TestUser testUser = new TestUser("Test", "User", "test-user", "password");
        MainPage mainPage = signUpPage.register(testUser).login(testUser);
        assertEquals("http://localhost:5173/", driver.getCurrentUrl());
    }
}
