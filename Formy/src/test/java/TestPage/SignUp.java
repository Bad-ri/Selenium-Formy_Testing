package TestPage;

import Pages.FormPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SignUp extends Base{
@Test
    public void ValidSignUp(){
       FormPage form = new FormPage(driver);
       HomePage home = new HomePage(driver);
       home.OpenHomePage();
       home.OpenSignUp();
       form.EnterFirstName("Mohamed");
       form.EnterLastName("Elbadri");
       form.EnterJobTitle("student");
       form.EnterEducationLevel();
       form.EnterSex();
       form.EnterExperienceYear(2);
       form.EnterDate("04/10/2023");
       form.PressSubmit();
       Assert.assertTrue(form.GetActualAlertMessage().contains(form.GetExpectedAlertMessage()),"Invalid Data");
    }
}
