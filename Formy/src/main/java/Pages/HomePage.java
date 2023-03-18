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
    By drag_and_drop = By.linkText("Drag and Drop");
    By home_page = By.cssSelector("a[id=\"logo\"]");
    public void OpenHomePage(){
        wait.until(ExpectedConditions.elementToBeClickable(home_page));
        driver.findElement(home_page).click();
    }
    public void OpenSignUp(){
        wait.until(ExpectedConditions.elementToBeClickable(form_link));
        driver.findElement(form_link).click();
    }
    public void OpenDragAndDrop(){
        wait.until(ExpectedConditions.elementToBeClickable(drag_and_drop));
        driver.findElement(drag_and_drop).click();
    }
}
