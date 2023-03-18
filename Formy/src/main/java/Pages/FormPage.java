package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage{
    private WebDriver driver;
    public FormPage(WebDriver driver){
        this.driver = driver;
    }
    By first_name = By.cssSelector("input[id=\"first-name\"]");
    By last_name = By.cssSelector("input[id=\"last-name\"]");
    By job_title = By.cssSelector("input[id=\"job-title\"]");
    By education_level = By.cssSelector("input[id=\"radio-button-1\"]");
    By sex = By.cssSelector("input[id=\"checkbox-2\"]");
    By experience_year = By.cssSelector("select[id=\"select-menu\"]");

    public void EnterFirstName(String FirstName){
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
}
