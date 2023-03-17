package Pages;
import org.openqa.selenium.By;

public class FormPage extends Base{
    By first_name = By.cssSelector("input[id=\"first-name\"]");
    By last_name = By.cssSelector("input[id=\"last-name\"]");
    public void EnterFirstName(String FirstName){
    driver.findElement(first_name).click();
    driver.findElement(first_name).sendKeys(FirstName);
}
    public void EnterLastName(String LastName){driver.findElement(last_name).sendKeys(LastName);
    }
}
