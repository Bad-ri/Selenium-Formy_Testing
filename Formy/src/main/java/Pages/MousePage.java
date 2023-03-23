package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class MousePage {
    WebDriver driver ;
    Actions  action ;
    WebDriverWait wait ;
    public MousePage(WebDriver driver){
        this.driver = driver ;
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
    By click_button = By.cssSelector("div[id=\"clickMe\"]");
    By result = By.cssSelector("span[id=\"button_0_normal\"]");
    public int DoubleClick(){
        wait.until(ExpectedConditions.elementToBeClickable(click_button));
        WebElement button = driver.findElement(click_button);
        action.doubleClick(button).perform();
        int Actual = Integer.parseInt(driver.findElement(result).getText());
        return Actual;
    }
    public void RightClick(){action.contextClick();
    }
    public void ScrollUp(){action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
    }
    public void ScrollDown(){
        wait.until(ExpectedConditions.titleIs("Formy"));
        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();}
}
