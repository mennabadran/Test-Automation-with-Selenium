package Login;

import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class CreateAccountTests extends BaseTests {

    @Test
    public void testCreateAccount() throws InterruptedException {
        LoginPage loginPage =  homePage.ClickSignIn();

        loginPage.SetEmail("Mennabadran1@gmail.com");

        CreateAccountPage createAccountPage = loginPage.ClickCreateAccountButton();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        assertEquals(createAccountPage.getCreateAccountHeader(),"Authentication","WrongPage");
    }
}
