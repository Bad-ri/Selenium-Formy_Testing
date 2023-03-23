package TestPage;

import Pages.HomePage;
import org.testng.annotations.Test;

public class Alert extends Base{
    @Test
    public void AlertMessage() {
        HomePage home = new HomePage(driver);
        home.OpenAlertPage();
        driver.switchTo().alert().accept();
        String Result = driver.switchTo().alert().getText();
        System.out.print("-----Alert------");
        System.out.print("Text = "+Result);
        System.out.print("-----------------");
    }
}
