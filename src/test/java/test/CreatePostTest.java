package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;


import java.nio.file.Path;
import java.nio.file.Paths;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreatePostTest extends BaseTest{

    @BeforeEach
     void init(){
        TestUser testUser = new TestUser("Test", "User", "test-user", "password");
        signUpPage.register(testUser).login(testUser).createPost();
    }


    @Test
    void testCreatePost() {
        Path path = Paths.get("src", "test", "resources", "lowQualityCat.jfif");
        createPostPage.createNewPost("testDescription", path);
        wait.until(ExpectedConditions.urlToBe("http://localhost:5173/"));
        assertTrue(mainPage.getPostByDescription("testDescription").isPresent());
    }
}
