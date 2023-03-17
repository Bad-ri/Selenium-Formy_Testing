package TestPage;

import Pages.FormPage;
import Pages.HomePage;
public class SignUp{
    public void SignUp() throws InterruptedException {
       FormPage FormObject = new FormPage();
       HomePage HomeObject = new HomePage();
        Thread.sleep(2000);
       HomeObject.OpenSignUp();
       Thread.sleep(2000);
       FormObject.EnterFirstName("Mohamed");
       FormObject.EnterLastName("Elbadri");
    }

}
