package TestPage;

import Pages.FormPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SignUp extends Base{
@Test
    public void ValidSignUp(){
       FormPage FormObject = new FormPage(driver);
       HomePage HomeObject = new HomePage(driver);
       HomeObject.OpenSignUp();
       FormObject.EnterFirstName("Mohamed");
       FormObject.EnterLastName("Elbadri");
       FormObject.EnterJobTitle("student");
       FormObject.EnterEducationLevel();
       FormObject.EnterSex();
       FormObject.EnterExperienceYear(2);
       FormObject.EnterDate("04/10/2023");
       FormObject.PressSubmit();
       Assert.assertTrue(FormObject.GetActualAlertMessage().contains(FormObject.GetExpectedAlertMessage()),"Invalid Data");
    }
}
