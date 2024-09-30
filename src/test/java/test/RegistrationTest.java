package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RegistrationTest extends BaseTest {


    @Test
    public void registrationWithValidCredentials(){
        TestUser testUser = new TestUser("Test", "User", "test-user", "password");
        signUpPage.register(testUser);
        wait.until(ExpectedConditions.urlToBe("http://localhost:5173/login"));
        assertEquals("http://localhost:5173/login", driver.getCurrentUrl());
    }

    @Test
    public void registrationWithExistingUserDetails(){
        TestUser testUser = new TestUser("Test", "User", "test-user", "password");
        signUpPage.register(testUser).login(testUser).logOut().clickOnSignUpButton().register(testUser);
        assertEquals("http://localhost:5173/signup", driver.getCurrentUrl());
    }
}
