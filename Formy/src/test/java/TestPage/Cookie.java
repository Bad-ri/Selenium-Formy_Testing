package TestPage;

import Pages.HomePage;
import org.testng.annotations.Test;

public class Cookie extends Base {
    @Test
    public void ManageCookies(){
        HomePage home = new HomePage(driver);
        home.OpenHomePage();
        String cookie = driver.manage().getCookies().toString();
        System.out.println("-------------");
        System.out.println(cookie);
        System.out.println("-------------");
        //driver.manage().deleteCookie(null);
        driver.manage().deleteAllCookies();
    }
}
