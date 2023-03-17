package Runner;

import Pages.Base;
import Pages.HomePage;
import TestPage.SignUp;

public class Runner{
    public static void main(String[] args) throws InterruptedException {
        Base BaseObject = new Base();
        BaseObject.OpenBrowser();
        HomePage HomeObject = new HomePage();
        HomeObject.OpenSignUp();
        SignUp SignUpObject = new SignUp();
        SignUpObject.SignUp();
        BaseObject.CloseBrowser();
    }
}
