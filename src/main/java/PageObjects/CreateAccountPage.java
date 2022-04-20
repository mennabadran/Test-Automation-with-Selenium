package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    private WebDriver driver;
    private By CreateAccountHeader = By.cssSelector(".navigation_page");
    public CreateAccountPage(WebDriver driver){
    this.driver = driver;}

    public String getCreateAccountHeader(){
        return driver.findElement(CreateAccountHeader).getText();
    }
}
