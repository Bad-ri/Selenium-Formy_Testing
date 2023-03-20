package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FormPage{
    private WebDriver driver;
    private  WebDriverWait wait;
    public FormPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(3));
    }
    By first_name = By.cssSelector("input[id=\"first-name\"]");
    By last_name = By.cssSelector("input[id=\"last-name\"]");
    By job_title = By.cssSelector("input[id=\"job-title\"]");
    By education_level = By.cssSelector("input[id=\"radio-button-1\"]");
    By sex = By.cssSelector("input[id=\"checkbox-2\"]");
    By experience_year = By.cssSelector("select[id=\"select-menu\"]");
    By date = By.cssSelector("input[id=\"datepicker\"]");
    By date_list = By.cssSelector("td[class=\"day\"]");
    By submit_button = By.cssSelector("a[role=\"button\"]");
    By alert_message = By.cssSelector("div[role=\"alert\"]");
    public void EnterFirstName(String FirstName){
        wait.until(ExpectedConditions.elementToBeClickable(first_name));
        driver.findElement(first_name).click();
    driver.findElement(first_name).sendKeys(FirstName);

}
    public void EnterLastName(String LastName){driver.findElement(last_name).sendKeys(LastName);
    }
    public void EnterJobTitle(String JobTitle){
        driver.findElement(job_title).click();
        driver.findElement(job_title).sendKeys(JobTitle);
    }
    public void EnterEducationLevel(){driver.findElement(education_level).click();
    }
    public void EnterSex(){driver.findElement(sex).click();
    }
    public void EnterExperienceYear(int Experience){
        Select year = new Select(driver.findElement(experience_year));
        year.selectByIndex(Experience);
    }
    public void EnterDate(String Date){driver.findElement(date).click();
    driver.findElement(date).sendKeys(Date);}
    public void PressSubmit(){
        driver.findElement(submit_button).click();}
    public String GetActualAlertMessage(){
        wait.until(ExpectedConditions.elementToBeClickable(alert_message));
        return driver.findElement(alert_message).getText();
    }
    public String GetExpectedAlertMessage(){return "The form was successfully submitted!";
    }
    public int GetDayList(){
        driver.findElement(date).click();
        List list = driver.findElements(date_list);
        return list.size();
    }
}
