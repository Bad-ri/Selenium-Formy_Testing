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
    By alert_link = By.linkText("Modal");
    By scroll_link = By.linkText("Page Scroll");
    By home_page = By.cssSelector("a[id=\"logo\"]");
    By model_button = By.cssSelector("button[id=\"modal-button\"]");
    public void OpenHomePage(){
        wait.until(ExpectedConditions.elementToBeClickable(home_page));
        driver.findElement(home_page).click();
    }
    public void OpenSignUp(){
        wait.until(ExpectedConditions.elementToBeClickable(form_link));
        driver.findElement(form_link).click();
    }
    public void OpenScrollPage(){
        wait.until(ExpectedConditions.elementToBeClickable(scroll_link));
        driver.findElement(scroll_link).click();
    }
    public void OpenAlertPage(){
        wait.until(ExpectedConditions.elementToBeClickable(alert_link));
        driver.findElement(alert_link).click();
        wait.until(ExpectedConditions.elementToBeClickable(model_button));
        driver.findElement(model_button).click();
    }
}
