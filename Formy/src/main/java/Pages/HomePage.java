package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage{
    private WebDriver driver;
    private WebDriverWait wait;
    public HomePage(WebDriver driver){this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
    By form_link = By.linkText("Form");
    public void OpenSignUp(){
        wait.until(ExpectedConditions.elementToBeClickable(form_link));
        driver.findElement(form_link).click();
    }
}
