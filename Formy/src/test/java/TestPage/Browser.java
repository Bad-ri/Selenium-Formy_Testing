package TestPage;

import Pages.HomePage;
import org.testng.annotations.Test;

public class Browser extends Base{
    @Test
    public void BrowserCommands(){
        HomePage home = new HomePage(driver);
        home.OpenHomePage();
        String CurrentUrl =  driver.getCurrentUrl();
        //get HTML code of the page
        String SourcePage = driver.getPageSource();
        String Title = driver.getTitle();
        System.out.println("-------Browser--------");
        System.out.println("Current Url = "+CurrentUrl);
        System.out.println("Title = "+Title);
        System.out.println("Source Page = "+SourcePage);
        System.out.println("----------------------");
    }
}
