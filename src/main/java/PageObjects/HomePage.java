package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By SingIn = By.linkText("Sign in");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public  LoginPage ClickSignIn(){
        driver.findElement(SingIn).click();
        return new LoginPage (driver);
    }
}
