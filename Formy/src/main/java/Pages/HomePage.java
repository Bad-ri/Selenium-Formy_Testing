package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    By form_link = By.linkText("Form");
    public void OpenSignUp(){
        driver.findElement(form_link).click();
    }
}
