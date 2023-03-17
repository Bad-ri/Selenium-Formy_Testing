package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage{
    private WebDriver driver;
    public FormPage(WebDriver driver){
        this.driver = driver;
    }
    By first_name = By.cssSelector("input[id=\"first-name\"]");
    By last_name = By.cssSelector("input[id=\"last-name\"]");

    public void EnterFirstName(String FirstName){
    driver.findElement(first_name).click();
    driver.findElement(first_name).sendKeys(FirstName);

}
    public void EnterLastName(String LastName){
        driver.findElement(last_name).sendKeys(LastName);
    }
}
