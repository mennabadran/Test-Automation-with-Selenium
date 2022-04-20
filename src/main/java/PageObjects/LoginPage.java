package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By EmailField = By.id("email_create");
    private By CreateAccountButton = By.id("SubmitCreate");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void SetEmail (String Email){
        driver.findElement(EmailField).sendKeys(Email);
    }

    public CreateAccountPage ClickCreateAccountButton(){
        driver.findElement(CreateAccountButton).click();
        return new CreateAccountPage(driver);
    }
}
