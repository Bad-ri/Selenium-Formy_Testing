package TestPage;

import Pages.FormPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class SignUp extends Base{
@Test
    public void SignUp() throws InterruptedException {
       FormPage FormObject = new FormPage(driver);
       HomePage HomeObject = new HomePage(driver);
        Thread.sleep(2000);
       HomeObject.OpenSignUp();
       Thread.sleep(2000);
       FormObject.EnterFirstName("Mohamed");
       FormObject.EnterLastName("Elbadri");
    }

}
