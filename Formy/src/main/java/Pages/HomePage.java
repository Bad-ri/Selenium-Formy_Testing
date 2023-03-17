package Pages;

import org.openqa.selenium.By;
public class HomePage extends Base{
    By form_link = By.linkText("Form");
    public void OpenSignUp(){
        driver.findElement(form_link).click();
    }
}
